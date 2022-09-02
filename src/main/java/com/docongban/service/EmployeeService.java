package com.docongban.service;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	
	boolean checkUsername(String username);
}
