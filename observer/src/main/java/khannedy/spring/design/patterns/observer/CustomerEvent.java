package khannedy.spring.design.patterns.observer;

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
