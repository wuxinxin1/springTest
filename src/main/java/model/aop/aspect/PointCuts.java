package model.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author wuxinxin
 *
 * 定义切点
 */

public class PointCuts {

    @Pointcut("execution(* model.aop.*.*(..))")
    public void pointCut1(){}

}
