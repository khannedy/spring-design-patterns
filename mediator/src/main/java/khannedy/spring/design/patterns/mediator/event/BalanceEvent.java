package khannedy.spring.design.patterns.mediator.event;

import khannedy.spring.design.patterns.mediator.entity.Balance;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class BalanceEvent extends ApplicationEvent {

  @Getter
  private Balance balance;

  public BalanceEvent(Balance balance) {
    super(balance);
    this.balance = balance;
  }
}
