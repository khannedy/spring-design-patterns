package khannedy.spring.design.patterns.singleton;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelperConfiguration.class)
public class HelperConfigurationTest {

  @Autowired
  private ObjectMapper objectMapper1;

  @Autowired
  private ObjectMapper objectMapper2;

  @Test
  public void testSingleton() {
    assertSame(objectMapper1, objectMapper2);
  }
}