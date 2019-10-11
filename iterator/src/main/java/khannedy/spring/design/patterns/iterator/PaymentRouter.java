package khannedy.spring.design.patterns.iterator;

import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PaymentRouter implements ApplicationContextAware {

  @Setter
  private ApplicationContext applicationContext;

  public void pay(Payment payment) {
    applicationContext.getBeansOfType(PaymentService.class).values()
      .stream()
      .filter(service -> service.isSupport(payment.getType()))
      .findFirst()
      .ifPresent(service -> service.pay(payment));
  }
}
