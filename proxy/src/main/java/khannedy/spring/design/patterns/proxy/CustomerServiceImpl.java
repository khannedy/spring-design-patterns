package khannedy.spring.design.patterns.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerServiceImpl implements CustomerService {

  @Override
  public void save(String id, String name) {
    log.info("Save new customer with id {} and name {}", id, name);
  }
}
