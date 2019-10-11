package khannedy.spring.design.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

  @Test
  public void testBuilder() {
    Customer customer1 = Customer.builder()
      .id("1")
      .name("Eko")
      .address("Indonesia")
      .build();

    Customer customer2 = new Customer("1", "Eko", "Indonesia");

    assertEquals(customer1, customer2);
  }
}