package edu.nwnu.ququzone.sjw.skeleton.user.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.nwnu.ququzone.sjw.skeleton.user.dao.UserDao;
import edu.nwnu.ququzone.sjw.skeleton.user.domain.User;

/**
 * user dao jap implement.
 * 
 * @author Yang XuePing
 */
@Component
public class UserDaoJpa implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUserByUsername(String username) {
        try {
            return em
                    .createQuery("from User where username = :username",
                            User.class).setParameter("username", username)
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
}
