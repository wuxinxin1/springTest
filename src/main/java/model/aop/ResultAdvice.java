package model.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


/**
 * 定义通知 后置通知
 */
public class ResultAdvice implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("========afterReturning======");
        System.out.println("method:"+method);
        System.out.println("objects:"+objects);
        System.out.println("Object:"+o);
        System.out.println("Object:"+o1);
        System.out.println("========afterReturning======\n");
    }
}
