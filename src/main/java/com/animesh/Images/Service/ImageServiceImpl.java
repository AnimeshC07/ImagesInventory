package com.animesh.Images.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animesh.Images.DAO.ImageDAO;
import com.animesh.Images.Entity.Image;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	ImageDAO imageDao;

	@Override
	public Integer storeImageUrl(String name ,String url) throws IOException{
		// TODO Auto-generated method stub
		Image newImg = new Image(name,url);
		Image savedImg = imageDao.save(newImg);
		return savedImg.getFileId();
	}

	@Override
	public Image getImage(Integer id) {
		// TODO Auto-generated method stub
		return imageDao.findByFileId(id);
	}

	@Override
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return imageDao.findAll();
	}

}
