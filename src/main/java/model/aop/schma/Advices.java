package model.aop.schma;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wuxinxin
 *
 *  定义切面，切面里面有通知
 *
 */

public class Advices {

    public void advice1() {
        System.out.println("===advice111===");
    }

}
