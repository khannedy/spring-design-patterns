package khannedy.spring.design.patterns.proxy;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class LogInterceptor implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    try {
      log.info("Before invoke");
      return methodInvocation.proceed();
    } finally {
      log.info("After invoke");
    }
  }
}
