package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;


@Service
public class UsersService {
	
UsersRepository userRepo;	

@Autowired
public UsersService(UsersRepository userRepo) {
    this.userRepo = userRepo;
}
	public UsersService() {
	// TODO Auto-generated constructor stub
}
	@SuppressWarnings("deprecation")
	public Users getUsersById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElse(null);
	}
	
	public Users saveUsers(Users user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	public void deletebyId(int id) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(id);
	}
	public void addUser(Users users) {
		// TODO Auto-generated method stub
		
	}

}
