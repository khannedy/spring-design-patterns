package khannedy.spring.design.patterns.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PrototypeConfiguration.class)
public class CustomerTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  public void testClone() {
    Customer customer1 = Customer.builder()
      .id("1")
      .name("Eko")
      .type(CustomerType.REGULER)
      .address("Indonesia")
      .build();

    Customer customer2 = new Customer();

    BeanUtils.copyProperties(customer1, customer2);

    assertEquals(customer1, customer2);
  }

  @Test
  public void testPrototypeScope() {
    Customer customer1 = applicationContext.getBean("customerPremium", Customer.class);
    Customer customer2 = applicationContext.getBean("customerPremium", Customer.class);

    assertEquals(customer1, customer2);
    assertNotSame(customer1, customer2);
  }
}