package web.dao;

import web.model.Role;
import web.model.User;
import java.util.List;
import java.util.Set;

public interface UserDao {

    User findByLastName(String lastname);

    User findById(Long id);

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    void updateUser(User user);


}

