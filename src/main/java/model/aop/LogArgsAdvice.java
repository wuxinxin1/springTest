package model.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 定义通知 前置通知
 */
public class LogArgsAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("========before======");
        System.out.println("method:"+method);
        System.out.println("objects:"+objects);
        System.out.println("Object:"+o);
        System.out.println("========before======");
    }

}
