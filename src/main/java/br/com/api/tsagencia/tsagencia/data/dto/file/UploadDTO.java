package br.com.api.tsagencia.tsagencia.data.dto.file;

import java.io.Serializable;
import java.util.Objects;

public class UploadDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String downloadUri;
    private String type;
    private long size;

    public UploadDTO() {}

    public UploadDTO(String fileName, String downloadUri, String type, long size) {
        this.name = fileName;
        this.downloadUri = downloadUri;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    public String getType() {
        return type;
    }

    public void setType(String fileType) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UploadDTO upload = (UploadDTO) o;
        return (
                getSize() == upload.getSize() && Objects.equals(getName(),
                upload.getName()) && Objects.equals(getDownloadUri(),
                upload.getDownloadUri()) && Objects.equals(getType(),
                upload.getType())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDownloadUri(), getType(), getSize());
    }
}