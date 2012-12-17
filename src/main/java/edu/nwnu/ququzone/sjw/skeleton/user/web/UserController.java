package edu.nwnu.ququzone.sjw.skeleton.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.nwnu.ququzone.sjw.skeleton.user.service.UserService;

/**
 * user controller.
 * 
 * @author Yang XuePing
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
}
