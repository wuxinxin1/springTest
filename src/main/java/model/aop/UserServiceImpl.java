package model.aop;

/**
 * userService 实现类
 */
public class UserServiceImpl implements UserService {
    public User createUser(String name) {
        System.out.println("UserServiceImpl createUser");
        User user = new User();
        user.setName("wxx");
        return user;
    }

    public User queryUser() {
        System.out.println("UserServiceImpl queryUser");
        User user = new User();
        user.setName("wxx");
        return user;
    }
}
