package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.repository.StudRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudRepository studRepository;
	
	@PostMapping("/insert")
	public void saveStudent(@RequestBody Student student) {
		studRepository.save(student);
	}
	
	@GetMapping("/get")
	public List<Student> getStudent(){
		List<Student> listStud = (List<Student>) studRepository.findAll();
		return listStud;
	}

	@PutMapping("/update{id}")
	public void updateStud(@PathVariable Integer id, @RequestBody Student student) {
		Optional<Student> stud = studRepository.findById(id);
		Student stud1 = stud.get();
		stud1.setName(student.getName());
		stud1.setMobno(student.getMobno());
		studRepository.save(stud1);
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studRepository.deleteById(id);
	}
}
