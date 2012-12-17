package edu.nwnu.ququzone.sjw.skeleton.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nwnu.ququzone.sjw.skeleton.user.dao.UserDao;
import edu.nwnu.ququzone.sjw.skeleton.user.domain.User;

/**
 * user service implement.
 * 
 * @author Yang XuePing
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.saveUser(user);
    }

}
