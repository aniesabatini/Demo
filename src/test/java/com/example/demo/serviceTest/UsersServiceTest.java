package com.example.demo.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;

public class UsersServiceTest {
	
	@InjectMocks
	private UsersService usersService;
	
	@Mock
	private UsersRepository userRepo;
	
	 @BeforeEach
	    void setUp() {
		 MockitoAnnotations.openMocks(this);	    }
	 
	 
	 /*public Users getUsersById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElse(null);
	} */
	 @Test
	 public void testgetUsersById() {
		 Users users=new Users(1,"Alice",null);
		 when(userRepo.findById(1)).thenReturn(Optional.of(users));
		 Users found= usersService.getUsersById(1);
		 assertEquals("Alice",found.getName());
		 assertEquals("Anir",found.getName());
	 }
	 
	 @Test
	 public void testgetAllUsers()
	 {
		 Users users=new Users(1,"Alice",null);
		 Users usersw=new Users(2,"anie",null);
		 List<Users> usersList = Arrays.asList(users, usersw);
		 when(userRepo.findAll()).thenReturn(usersList);

List<Users> usersall= usersService.getAllUsers();
assertEquals(1,usersall.get(0).getId());
assertEquals("anie",usersall.get(1).getName());
assertEquals("asie",usersall.get(1).getName());

	 }
	 
	 @Test
	 public void testUpdateUser() {
		 Users users=new Users(3,"Alicia",null);
		 when(userRepo.save(users)).thenReturn(users);
		 Users updated=usersService.saveUsers(users);
		 assertEquals(3,updated.getId());
	 }
	@Test
	public void testDeleteUser() {
		//Users users=new Users(4,"gog",null);
		//when(userRepo.findById(4)).thenReturn(Optional.of(users));
		usersService.deletebyId(4);
		//assertEquals(4, del.getId());
		//verify(userRepo, times(1)).deleteById(4);
	}
}