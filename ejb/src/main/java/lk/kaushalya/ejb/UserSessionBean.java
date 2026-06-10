package lk.kaushalya.ejb;

import jakarta.ejb.Stateless;
import lk.kaushalya.core.dto.UserDTO;
import lk.kaushalya.core.service.UserService;

import java.util.List;

@Stateless
public class UserSessionBean implements UserService {
    @Override
    public UserDTO getUserByID(Long id) {
        System.out.println("getUserById");
        return null;
    }

    @Override
    public void addUser(UserDTO dto) {
        System.out.println("addUser");
    }

    @Override
    public void updateUser(UserDTO dto) {
        System.out.println("updateUser");
    }

    @Override
    public void deleteUser(Long id) {
        System.out.println("deleteUser");
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
