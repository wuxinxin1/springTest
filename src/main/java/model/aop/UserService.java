package model.aop;


public interface UserService {
    /**
     * 创建用户
     * @param name
     * @return
     */
    User createUser(String name);


    /**
     * 查询用户
     * @return
     */
    User queryUser();
}
