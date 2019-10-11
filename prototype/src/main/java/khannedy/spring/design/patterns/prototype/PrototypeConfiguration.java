package khannedy.spring.design.patterns.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeConfiguration {

  @Bean
  @Scope("prototype")
  public Customer customerPremium() {
    return Customer.builder()
      .type(CustomerType.PREMIUM)
      .build();
  }

}
