package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.configurations.FileUploadConfiguration;
import br.com.api.tsagencia.tsagencia.exception.FileNotFoundException;
import br.com.api.tsagencia.tsagencia.exception.FileUploadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileService {
    private static final Logger logger = LoggerFactory.getLogger(FileService.class);
    private final Path uploadLocation;

    @Autowired
    public FileService(FileUploadConfiguration fileUploadConfiguration) {
        Path path = Paths.get(fileUploadConfiguration.getUploadDir()).toAbsolutePath().normalize();
        this.uploadLocation = path;

        try {
            logger.info("Creating directories!");
            Files.createDirectories(this.uploadLocation);
        } catch (Exception exception) {
            final String defaultErrorMessage = "The directory where the files will be saved could not be created!";

            logger.error(defaultErrorMessage);
            throw new FileUploadException(defaultErrorMessage, exception);
        }
    }

    public String uploadFile(MultipartFile file) {
        String name = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (name.contains("..")) {
                final String defaultErrorMessage = "The file sent " + name + " contain an invalid path!";

                logger.error(defaultErrorMessage);
                throw new FileUploadException(defaultErrorMessage);
            }

            logger.info("Saving file in disk!");
            Path location = this.uploadLocation.resolve(name);
            Files.copy(file.getInputStream(), location, StandardCopyOption.REPLACE_EXISTING);

            return name;
        } catch (Exception exception) {
            final String defaultErrorMessage = "The file cannot be saved " + name + ". Please try again!";

            logger.error(defaultErrorMessage);
            throw new FileUploadException(defaultErrorMessage, exception);
        }
    }

    public Resource loadFileAsResource(String name) {
        try {
            Path path = this.uploadLocation.resolve(name).normalize();
            Resource resource = new UrlResource(path.toUri());

            if (resource.exists()) {
                return resource;
            }

            final String defaultErrorMessage = "File not found " + name;

            logger.error(defaultErrorMessage);
            throw new FileNotFoundException(defaultErrorMessage);
        } catch (Exception exc) {
            final String defaultErrorMessage = "File not found " + name;

            logger.error(defaultErrorMessage);
            throw new FileNotFoundException(defaultErrorMessage, exc);
        }
    }
}