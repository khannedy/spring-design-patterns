package khannedy.spring.design.patterns.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelperConfiguration.class)
public class ObjectMapperFactoryBeanTest {

  @Autowired
  private ObjectMapper objectMapper1;

  @Autowired
  private ObjectMapper objectMapper2;

  @Test
  public void testFactory() {
    assertSame(objectMapper1, objectMapper2);
  }
}