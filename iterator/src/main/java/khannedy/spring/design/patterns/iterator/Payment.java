package khannedy.spring.design.patterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  private String orderId;

  private Long total;

  private PaymentType type;
}
