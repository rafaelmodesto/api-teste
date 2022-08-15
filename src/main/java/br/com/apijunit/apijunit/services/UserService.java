package br.com.apijunit.apijunit.services;

import br.com.apijunit.apijunit.domain.User;
import br.com.apijunit.apijunit.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
