package lk.javaspringbootacadamy.demo.service;

import lk.javaspringbootacadamy.demo.dto.ResponseDTO;
import lk.javaspringbootacadamy.demo.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO);
}
