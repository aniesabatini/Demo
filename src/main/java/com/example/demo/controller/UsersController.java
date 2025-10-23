package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	UsersService usersService;
	
	public UsersController(UsersService usersService) {
		this.usersService=usersService;
	}
	
@GetMapping("/{id}")	
public Users getUsersById(@PathVariable int id) {
	return usersService.getUsersById(id);
	
}

@PostMapping
public Users CreateUser(@RequestBody Users user) {
return usersService.saveUsers( user);
}
	
@GetMapping
public List<Users> getAllUsers(){
	return usersService.getAllUsers();
}
	
}
