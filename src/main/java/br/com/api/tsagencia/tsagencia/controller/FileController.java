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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/file")
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileUploadService service;

    @PostMapping("/upload")
    public UploadDTO upload(@RequestParam("file") MultipartFile file) {
        String name = service.uploadFile(file);
        String downloadUri =
                ServletUriComponentsBuilder
                        .fromCurrentContextPath().path("/file/download").path(name).toUriString();

        return new UploadDTO(name, downloadUri, file.getContentType(), file.getSize());
    }

    @PostMapping("/multipleUpload")
    public List<UploadDTO> multipleUpload(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files).stream().map(file -> upload(file)).collect(Collectors.toList());
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> download() {
        return null;
    }
}