package bean.tx;

/**
 * 业务接口
 */
public interface LoginService {

    /**
     * 登陆，校验密码
     * @param userName
     * @param password
     * @return
     */
    Boolean login(String userName,String password);

    /**
     * 根据用户名修改密码
     * @param userName
     * @param newPassword
     * @return
     */
    Boolean modifyPassword(String userName,String newPassword);

}
