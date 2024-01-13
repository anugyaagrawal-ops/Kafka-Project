package com.example.policybazaar.com.customer.Services;

import java.util.Optional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.policybazaar.com.customer.Entity.UserInfo;
import com.example.policybazaar.com.customer.Repository.UserInfoRepository;

@Service
public class UserInfoService implements UserDetailsService{

	@Autowired
	private UserInfoRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UserInfo> userInfo = repository.findByName(username);
		return userInfo.map(UserInfoDetails:: new)
				.orElseThrow(()->new UsernameNotFoundException("User not found"+username));
	}
	
	public String addUser(UserInfo userInfo) {
		userInfo.setPassword(encoder.encode(userInfo.getPassword()));
		UserInfo user = repository.save(userInfo);
		String message = "";
		if(user != null) {
			message = "User added successfully";
		}
		return message;
	}
	
	public List<UserInfo> getAllUser(){
		return repository.findAll();
	}
	
	public UserInfo getUser(int id) {
		return repository.findById(id).orElse(null);
	}

}
