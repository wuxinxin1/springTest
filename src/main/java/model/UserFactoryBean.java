package model;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
