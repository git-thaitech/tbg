package net.techeese.tbgspring.rest.Impl;

import net.techeese.tbgspring.rest.IUserRest;
import net.techeese.tbgspring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements IUserRest {

    @Autowired
    IUserService iUserService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMapping) {
        try {
return IUserService.signUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<"/message:>();
    }
}
