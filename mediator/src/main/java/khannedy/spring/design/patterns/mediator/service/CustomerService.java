package khannedy.spring.design.patterns.mediator.service;

import khannedy.spring.design.patterns.mediator.entity.Customer;
import khannedy.spring.design.patterns.mediator.event.BalanceEvent;
import khannedy.spring.design.patterns.mediator.event.CustomerEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService implements ApplicationListener<BalanceEvent>, ApplicationEventPublisherAware {

  @Setter
  private ApplicationEventPublisher applicationEventPublisher;

  public Customer save(String id, String name) {
    Customer customer = Customer.builder()
      .id(id)
      .name(name)
      .build();

    applicationEventPublisher.publishEvent(new CustomerEvent(customer));

    return customer;
  }

  @Override
  public void onApplicationEvent(BalanceEvent event) {
    log.info("Receive balance for customer {} with total {}", event.getBalance().getId(), event.getBalance().getBalance());
  }
}
