package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.configurations.FileUploadConfiguration;
import br.com.api.tsagencia.tsagencia.exception.FileUploadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileUploadService {
    private static final Logger logger = LoggerFactory.getLogger(FileUploadService.class);
    private final Path fileUploadLocation;

    @Autowired
    public FileUploadService(FileUploadConfiguration fileUploadConfiguration) {
        Path path = Paths.get(fileUploadConfiguration.getUploadDir()).toAbsolutePath().normalize();
        this.fileUploadLocation = path;

        try {
            logger.info("Creating directories!");
            Files.createDirectories(this.fileUploadLocation);
        } catch (Exception exception) {
            final String defaultErrorMessage = "The directory where the files will be saved could not be created!";

            logger.error(defaultErrorMessage);
            throw new FileUploadException(defaultErrorMessage, exception);
        }
    }

    public String uploadFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                final String defaultErrorMessage = "The file sent " + fileName + " contain an invalid path!";

                logger.error(defaultErrorMessage);
                throw new FileUploadException(defaultErrorMessage);
            }

            logger.info("Saving file in disk!");
            Path location = this.fileUploadLocation.resolve(fileName);
            Files.copy(file.getInputStream(), location, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (Exception exception) {
            final String defaultErrorMessage = "The file cannot be saved " + fileName + ". Please try again!";

            logger.error(defaultErrorMessage);
            throw new FileUploadException(defaultErrorMessage, exception);
        }
    }
}