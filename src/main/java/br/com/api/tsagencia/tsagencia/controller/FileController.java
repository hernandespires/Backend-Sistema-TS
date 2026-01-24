package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.data.dto.file.UploadDTO;
import br.com.api.tsagencia.tsagencia.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/file")
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileUploadService service;

    @PostMapping("/upload")
    public UploadDTO upload(@RequestParam("file") MultipartFile file) {
        String fileName = service.uploadFile(file);
        String fileDownloadUri =
                ServletUriComponentsBuilder
                        .fromCurrentContextPath().path("/file/download").path(fileName).toUriString();

        return new UploadDTO(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> download() {
        return null;
    }
}