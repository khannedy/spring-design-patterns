package khannedy.spring.design.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private String id;

  private String name;

  private String address;

  private CustomerType type;

}
