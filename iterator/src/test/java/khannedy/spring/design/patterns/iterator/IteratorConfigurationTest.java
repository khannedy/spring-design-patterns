package khannedy.spring.design.patterns.iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IteratorConfiguration.class)
public class IteratorConfigurationTest {

  @Autowired
  private PaymentRouter paymentRouter;

  @Test
  public void payCreditCard() {
    paymentRouter.pay(Payment.builder()
      .orderId("1")
      .total(1_000_000L)
      .type(PaymentType.CREDIT_CARD)
      .build());
  }

  @Test
  public void payKlikBca() {
    paymentRouter.pay(Payment.builder()
      .orderId("1")
      .total(1_000_000L)
      .type(PaymentType.KLIKBCA)
      .build());
  }

  @Test
  public void payMandiriClickpay() {
    paymentRouter.pay(Payment.builder()
      .orderId("1")
      .total(1_000_000L)
      .type(PaymentType.MANDIRI_CLICKPAY)
      .build());
  }
}