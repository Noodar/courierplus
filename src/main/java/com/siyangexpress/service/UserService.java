package com.siyangexpress.service;

import java.util.List;
import java.util.Map;

import com.siyangexpress.domain.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserById(String userId);

	List<User> getUsersByCategory(String category);

	List<User> getUsersByFilter(Map<String, List<String>> filterParams);
	
	void addUser(User user);

}
