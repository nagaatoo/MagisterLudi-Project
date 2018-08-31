package ru.MagisterLudi.DataMaster.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseDocument {

    private String uuid;
    private String description;
    private String fileName;
    private String ownerName;
    private byte[] file;

    public BaseDocument() {

    }

    public BaseDocument(String uuid, String description,
                       String fileName, String ownerName,
                       byte[] file) {
        this.uuid = uuid;
        this.description = description;
        this.fileName = fileName;
        this.ownerName = ownerName;
        this.file = file;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUUID() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

}