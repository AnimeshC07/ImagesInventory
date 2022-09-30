package com.animesh.Images.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animesh.Images.Entity.Image;
import com.animesh.Images.Service.ImageService;

@RestController
public class ImageControllerImpl implements ImageController{
	
	@Autowired
	ImageService imageService;
	
	@PostMapping("/storeImg")
	public ResponseEntity<Integer> storeImage(@RequestBody Image image) throws IOException{
		
		Integer filecode = imageService.storeImageUrl(image.getFileName(), image.getFileURI());
		
		return new ResponseEntity<>(filecode,HttpStatus.OK);
		
	}

	@Override
	@GetMapping("/getImg/{id}")
	public ResponseEntity<Image> getImageById(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(imageService.getImage(id),HttpStatus.OK) ;
	}

	@Override
	@GetMapping("getImg")
	public ResponseEntity<List<Image>> getImages() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(imageService.getAllImages(),HttpStatus.OK);
	}

}
