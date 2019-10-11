package khannedy.spring.design.patterns.proxy;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

public interface AccountService {

  @Validated
  void save(@NotBlank String id,
            @NotBlank @Length(min = 1, max = 10) String name);
}
