package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {
	
	private final UserRepository userRepository;
	
	MyUserController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	List<User>getAll(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable Long id)
	{
		return userRepository.findById(id);
	}
	

	// sign up form operation use PostMapping
	@PostMapping("/users")
	User newUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	
	@DeleteMapping("/users/{id}")
	void deleteUserById(@PathVariable Long id)
	{
		userRepository.deleteById(id); //no need to return anything
	}
	
	
	// update query
	@PutMapping("/users/{id}")
	User updateUser(@PathVariable Long id, @RequestBody User newUser){
		return userRepository.findById(id).map(
				user -> {
					user.setName(newUser.getName());
					return userRepository.save(user);
				}).orElseGet( ()-> {
				newUser.setId(id);
				return userRepository.save(newUser); // creates new user
				});
	}
	
}