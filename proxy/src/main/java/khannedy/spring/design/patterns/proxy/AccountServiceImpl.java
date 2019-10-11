package khannedy.spring.design.patterns.proxy;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Service
@Validated
public class AccountServiceImpl implements AccountService {

  public void save(@NotBlank String id,
                   @NotBlank @Length(min = 1, max = 10) String name) {
    // do something
  }

}
