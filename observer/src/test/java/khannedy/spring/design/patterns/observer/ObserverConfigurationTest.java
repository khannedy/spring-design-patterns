package khannedy.spring.design.patterns.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ObserverConfiguration.class)
public class ObserverConfigurationTest {

  @Autowired
  private CustomerService customerService;

  @Test
  public void testObserver() {
    customerService.save("1", "Eko");
  }
}