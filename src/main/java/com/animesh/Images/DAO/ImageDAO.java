package com.animesh.Images.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.animesh.Images.Entity.Image;

public interface ImageDAO extends JpaRepository<Image, Integer>{
	
	public Image findByFileId(Integer id);

}
