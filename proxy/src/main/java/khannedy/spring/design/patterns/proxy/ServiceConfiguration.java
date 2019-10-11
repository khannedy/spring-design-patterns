package khannedy.spring.design.patterns.proxy;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

  @Bean
  public LogInterceptor logInterceptor() {
    return new LogInterceptor();
  }

  @Bean
  public ProxyFactoryBean customerService() {
    ProxyFactoryBean bean = new ProxyFactoryBean();
    bean.setInterfaces(CustomerService.class);
    bean.setTarget(new CustomerServiceImpl());
    bean.setInterceptorNames("logInterceptor");
    return bean;
  }

}
