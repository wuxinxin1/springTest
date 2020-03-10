package model.aop;

/**
 * userService 实现类
 */
public class UserServiceImpl implements UserService {
    public User createUser(String name) {
        User user = new User();
        user.setName("wxx");
        return user;
    }

    public User queryUser() {
        User user = new User();
        user.setName("wxx");
        return user;
    }
}
