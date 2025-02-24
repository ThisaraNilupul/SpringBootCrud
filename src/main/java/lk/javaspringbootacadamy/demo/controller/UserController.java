package lk.javaspringbootacadamy.demo.controller;

import lk.javaspringbootacadamy.demo.dto.ResponseDTO;
import lk.javaspringbootacadamy.demo.dto.UserDTO;
import lk.javaspringbootacadamy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDTO> saveUsers(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
