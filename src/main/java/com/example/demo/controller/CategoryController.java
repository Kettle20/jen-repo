package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	List<Category> findAll(){
		return categoryService.findAll();
	}
	
	@GetMapping("/{id}")
	Category findById(@PathVariable Long id) {
		return categoryService.findById(id);
	}
	
	@PostMapping
	Category create(@RequestBody Category payload) {
		return categoryService.create(payload);
	}
	
	@PutMapping("/{id}")
	Category update(@PathVariable Long id, @RequestBody Category payload) {
		return categoryService.update(id, payload);
	}
	
	@DeleteMapping("/{id}")
	Boolean delete(@PathVariable Long id) {
		return categoryService.delete(id);
	}

}
