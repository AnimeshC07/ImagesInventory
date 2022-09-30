package com.animesh.Images.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.animesh.Images.Entity.Image;

public interface ImageService {
	
	public Integer storeImageUrl(String name , String url)throws IOException;
	public Image getImage(Integer id);
	public List<Image> getAllImages();

}
