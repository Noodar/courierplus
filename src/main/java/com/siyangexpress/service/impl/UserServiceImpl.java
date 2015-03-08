package com.siyangexpress.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siyangexpress.domain.User;
import com.siyangexpress.repository.UserRepository;
import com.siyangexpress.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByFilter(Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
	}

}
