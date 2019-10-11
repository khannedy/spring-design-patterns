package khannedy.spring.design.patterns.mediator.service;

import khannedy.spring.design.patterns.mediator.entity.Balance;
import khannedy.spring.design.patterns.mediator.entity.Customer;
import khannedy.spring.design.patterns.mediator.event.BalanceEvent;
import khannedy.spring.design.patterns.mediator.event.CustomerEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BalanceService implements ApplicationListener<CustomerEvent>, ApplicationEventPublisherAware {

  @Setter
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void onApplicationEvent(CustomerEvent event) {
    Customer customer = event.getCustomer();
    log.info("Receive new customer {}", customer);

    Balance balance = Balance.builder()
      .id(customer.getId())
      .balance(0L)
      .build();

    applicationEventPublisher.publishEvent(new BalanceEvent(balance));
  }
}
