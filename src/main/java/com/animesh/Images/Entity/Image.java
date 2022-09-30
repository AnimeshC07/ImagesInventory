package com.animesh.Images.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fileId;
	private String fileName;
	private String fileURI;
	
	public Image() {
		super();
	}
		
	public Image(String fileName, String fileURI) {
		super();
		this.fileName = fileName;
		this.fileURI = fileURI;
	}
	public Integer getFileId() {
		return fileId;
	}
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileURI() {
		return fileURI;
	}
	public void setFileURI(String fileURI) {
		this.fileURI = fileURI;
	}
	@Override
	public String toString() {
		return "Image [fileId=" + fileId + ", fileName=" + fileName + ", fileURI=" + fileURI + "]";
	}
	
	
	
	

}
