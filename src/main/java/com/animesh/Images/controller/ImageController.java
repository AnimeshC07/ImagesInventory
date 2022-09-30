package com.animesh.Images.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.animesh.Images.Entity.Image;

public interface ImageController {
	
	public ResponseEntity<Integer> storeImage(@RequestBody Image image) throws IOException;
	public ResponseEntity<Image> getImageById(@PathVariable("id") Integer id);
	public ResponseEntity<List<Image>> getImages();

}
