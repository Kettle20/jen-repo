package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepo categoryRepo;

	@Override
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}

	@Override
	public Category findById(Long id) {
		return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Invalid ID."));
	}

	@Override
	public Category create(Category payload) {
		System.err.println("create >" + payload);
		return categoryRepo.save(payload);
	}

	@Override
	public Category update(Long id, Category payload) {
		Category category = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Invalid ID."));
		category.setName(payload.getName());
		return categoryRepo.save(payload);
	}

	@Override
	public Boolean delete(Long id) {
		Category category = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Invalid ID."));
		categoryRepo.delete(category);
		return true;
	}

}
