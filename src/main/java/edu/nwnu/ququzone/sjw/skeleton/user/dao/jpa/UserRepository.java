package edu.nwnu.ququzone.sjw.skeleton.user.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import edu.nwnu.ququzone.sjw.skeleton.user.domain.User;

/**
 * user model jpa repository.
 * 
 * @author Yang XuePing
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
