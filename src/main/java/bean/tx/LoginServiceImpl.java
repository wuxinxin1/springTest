package bean.tx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;

import java.util.List;
import java.util.Map;

public class LoginServiceImpl implements LoginService{

    private JdbcTemplate jdbcTemplate;

    private UserService userService;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Boolean login(String userName, String password) {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from tradelog");

        System.out.println(maps);

        return Boolean.TRUE;
    }

    /**
     * 事务传播行为的使用
     * 1.REQUIRED 如果存在，则支持，如果不存在，则新建（子事务和原来事务影响的，要莫一起提交，要莫一起回滚 子事务标记rollback-only告诉上层事务）
     * 2.REQUIRES_NEW  如过存在，则挂起并且新建一个，如果不存在，则新建(子事务与原来事务是隔离的提交回滚不影响)
     * @param userName
     * @param newPassword
     * @return
     */
    public Boolean modifyPassword(String userName, String newPassword) {
        jdbcTemplate.update("update tradelog set operator=7 where id=1");

        //测试默认传播行为
        /*try {
            //throwEx();
            userService.updateUser();

        }catch (Exception e){
            System.out.println("aaa");
        }*/

        //测试require_new

        //userService.updateUser();

       /* try{
            userService.updateUser();
        }catch (Exception e){
            System.out.println("aaa");
        }*/

       //测试 read-only 如果写了修改语句，那么会抛出StatementCallback

        return Boolean.TRUE;
    }

  /*  public Boolean throwEx(){
        throw new NullPointerException();
    }*/
}
