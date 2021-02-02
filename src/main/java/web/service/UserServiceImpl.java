package web.service;

import web.dao.UserDao;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void removeUser(int id) {
        this.userDao.removeUser(id);
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return this.userDao.listUser();
    }
}
