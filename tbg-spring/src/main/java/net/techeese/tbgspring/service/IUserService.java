package net.techeese.tbgspring.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    static ResponseEntity<String> signUp();
}