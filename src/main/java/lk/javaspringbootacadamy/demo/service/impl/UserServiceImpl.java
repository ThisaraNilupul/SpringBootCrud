package lk.javaspringbootacadamy.demo.service.impl;

import lk.javaspringbootacadamy.demo.dto.ResponseDTO;
import lk.javaspringbootacadamy.demo.dto.UserDTO;
import lk.javaspringbootacadamy.demo.entity.User;
import lk.javaspringbootacadamy.demo.repository.UserRepository;
import lk.javaspringbootacadamy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        userRepository.save(user);
        return new ResponseEntity<>(ResponseDTO.builder()
                .message("Save user successfully")
                .code(HttpStatus.CREATED)
                .build(),HttpStatus.CREATED);
    }
}
