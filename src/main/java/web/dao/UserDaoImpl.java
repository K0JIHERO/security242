package web.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private SessionFactory sessionFactory;

    SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
//        Session session = sessionFactory.openSession();
//        session.save(user);
//        session.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
//        Session session = sessionFactory.getCurrentSession();
//        session.merge(user);
//        entityManager.merge(user);
    }


    @Override
    public void removeUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
//        Session session = sessionFactory.getCurrentSession();
//        User user = (User) session.load(User.class, id); // new Integer(id)

//        if (user!=null) {
//            session.delete(user);
//        }
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
//        Session session = sessionFactory.getCurrentSession();
//        return session.find(User.class, id);
    }

    @Override
    public List<User> listUser() {
        List<User> userList = entityManager.createQuery("from User").getResultList();
//        Session session = sessionFactory.getCurrentSession();
//        List<User> userList = session.createQuery("from User").list();

        return userList;
    }
}
