package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
//        session.persist(user);
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);

    }

    @Override
    public void removeUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id); // new Integer(id)

        if (user!=null) {
            session.delete(user);
        }
    }

    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id); //new Integer(id)
        return user;
    }

    @Override
    public List<User> listUser() {
        Session session = sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();

        return userList;
    }
}
