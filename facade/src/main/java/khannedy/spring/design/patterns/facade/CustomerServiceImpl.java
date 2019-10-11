package khannedy.spring.design.patterns.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerServiceImpl implements CustomerService {

  @Override
  public void create(String id, String name) {
    log.info("Complex code to create customer");
  }
}
