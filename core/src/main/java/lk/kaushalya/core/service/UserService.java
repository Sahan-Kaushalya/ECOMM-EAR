package lk.kaushalya.core.service;

import jakarta.ejb.Remote;
import lk.kaushalya.core.dto.UserDTO;

import java.util.List;

@Remote
public interface UserService {
    UserDTO getUserByID(Long id);
    void addUser(UserDTO dto);
    void updateUser(UserDTO dto);
    void deleteUser(Long id);
    List<UserDTO> getAllUsers();
}
