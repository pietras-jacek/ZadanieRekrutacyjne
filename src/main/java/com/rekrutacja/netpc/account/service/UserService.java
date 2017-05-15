package com.rekrutacja.netpc.account.service;

import com.rekrutacja.netpc.account.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}