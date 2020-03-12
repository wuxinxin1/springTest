package model.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wuxinxin
 *
 *  定义通知
 */
@Aspect
public class Advices {

    @Before("model.aop.aspect.PointCuts.pointCut1()")
    public void advice1() {
        System.out.println("===advice1===");
    }

}
