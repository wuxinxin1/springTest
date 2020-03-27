package bean.tx;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void updateUser() {
        //子事务执行
        jdbcTemplate.update("update tradelog set operator=70 where id=4");
        throw new NullPointerException();
    }
}
