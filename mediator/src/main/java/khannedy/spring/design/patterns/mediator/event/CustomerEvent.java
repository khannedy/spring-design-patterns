package khannedy.spring.design.patterns.mediator.event;

import khannedy.spring.design.patterns.mediator.entity.Customer;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {

  @Getter
  private Customer customer;

  public CustomerEvent(Customer customer) {
    super(customer);
    this.customer = customer;
  }
}
