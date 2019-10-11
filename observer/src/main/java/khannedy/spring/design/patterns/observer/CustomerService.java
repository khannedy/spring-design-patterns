package khannedy.spring.design.patterns.observer;

import lombok.Setter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ApplicationEventPublisherAware {

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

}
