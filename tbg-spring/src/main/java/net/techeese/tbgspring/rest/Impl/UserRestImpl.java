package net.techeese.tbgspring.rest.Impl;

import net.techeese.tbgspring.rest.IUserRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements IUserRest {
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMapping) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
