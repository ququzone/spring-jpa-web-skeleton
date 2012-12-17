package edu.nwnu.ququzone.sjw.skeleton.user.dao;

import java.util.List;

import edu.nwnu.ququzone.sjw.skeleton.user.domain.User;

/**
 * User dao definition.
 * 
 * @author Yang XuePing
 */
public interface UserDao {
    /**
     * save user.
     * 
     * @param user
     */
    void saveUser(User user);

    /**
     * get user by username.
     * 
     * @param username
     * @return
     */
    List<User> getUserByUsername(String username);
}
