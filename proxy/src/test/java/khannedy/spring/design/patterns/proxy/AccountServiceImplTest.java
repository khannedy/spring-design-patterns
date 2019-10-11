package khannedy.spring.design.patterns.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountConfiguration.class)
public class AccountServiceImplTest {

  @Autowired
  private AccountService accountService;

  @Test(expected = Throwable.class)
  public void testSaveValidationNotBlank() {
    accountService.save("", "");
  }

  @Test(expected = Throwable.class)
  public void testSaveNameTooLong() {
    accountService.save("1", "NAME TOO LONGGGGGGGGGGGGGGGGGGGG");
  }

  @Test
  public void testSaveSuccess() {
    accountService.save("1", "Eko");
  }
}