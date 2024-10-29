package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryService {
	List<Category> findAll();
	Category findById(Long id);
	Category create(Category payload);
	Category update(Long id, Category payload);
	Boolean delete(Long id);
}
