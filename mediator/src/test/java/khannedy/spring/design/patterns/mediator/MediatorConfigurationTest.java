package khannedy.spring.design.patterns.mediator;

import khannedy.spring.design.patterns.mediator.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MediatorConfiguration.class)
public class MediatorConfigurationTest {

  @Autowired
  private CustomerService customerService;

  @Test
  public void testMediator() {
    customerService.save("1", "Eko");
  }
}