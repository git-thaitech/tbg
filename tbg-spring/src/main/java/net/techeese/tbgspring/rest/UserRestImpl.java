package net.techeese.tbgspring.rest;

import lombok.RequiredArgsConstructor;
import net.techeese.tbgspring.constants.TbgConstant;
import net.techeese.tbgspring.service.IUserService;
import net.techeese.tbgspring.utils.TbgUtils;
import net.techeese.tbgspring.wrapper.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
public class UserRestImpl implements IUserRest {

    @Autowired
    private IUserService iUserService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
            return IUserService.signUp(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> login(Map<String, String> requestMap) {
        try{
            return iUserService.login(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<UserWrapper>> getAllUsers() {
        try {
            return iUserService.getAllUsers();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> update(Map<String, String> requestMap) {
        try {
            return iUserService.update(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> checkToken() {
        try {
            return iUserService.checkToken();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> changePassword(Map<String, String> requestMap) {
        try{
            return iUserService.changePassword(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> forgotPassword(Map<String, String> requestMap) {
        try {
            return iUserService.forgotPassword(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return TbgUtils.getResponseEntity(TbgConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
