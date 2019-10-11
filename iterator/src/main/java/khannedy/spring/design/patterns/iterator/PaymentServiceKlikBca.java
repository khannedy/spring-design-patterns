package khannedy.spring.design.patterns.iterator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentServiceKlikBca implements PaymentService {

  @Override
  public boolean isSupport(PaymentType type) {
    return PaymentType.KLIKBCA.equals(type);
  }

  @Override
  public void pay(Payment payment) {
    log.info("Pay KLIK BCA");
  }
}
