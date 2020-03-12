package model.aop;

import org.aspectj.lang.annotation.Aspect;

/**
 * userService 实现类
 */
public class UserServiceImpl implements UserService {
    public User createUser(String name) {
        System.out.println("UserServiceImpl createUser\n\n");
        User user = new User();
        user.setName("wxx");
        return user;
    }

    public User queryUser() {
        System.out.println("UserServiceImpl queryUser\n\n");
        User user = new User();
        user.setName("wxx");
        return user;
    }
}
