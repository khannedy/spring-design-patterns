package khannedy.spring.design.patterns.iterator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentServiceMandiriClickpay implements PaymentService {

  @Override
  public boolean isSupport(PaymentType type) {
    return PaymentType.MANDIRI_CLICKPAY.equals(type);
  }

  @Override
  public void pay(Payment payment) {
    log.info("Pay MANDIRI CLICKPAY");
  }
}
