package khannedy.spring.design.patterns.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerEventListener implements ApplicationListener<CustomerEvent> {

  @Override
  public void onApplicationEvent(CustomerEvent event) {
    log.info("Receive customer {}", event);
  }
}
