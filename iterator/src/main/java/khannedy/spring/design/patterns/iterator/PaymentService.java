package khannedy.spring.design.patterns.iterator;

public interface PaymentService {

  boolean isSupport(PaymentType type);

  void pay(Payment payment);

}
