package khannedy.spring.design.patterns;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MandatoryParameter {

  private String requestId;

  private String serviceId;

  private String userId;

  private Long timestamp;

}
