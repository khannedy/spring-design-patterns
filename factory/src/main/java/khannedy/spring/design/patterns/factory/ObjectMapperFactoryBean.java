package khannedy.spring.design.patterns.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapperFactoryBean implements FactoryBean<ObjectMapper> {

  @Override
  public ObjectMapper getObject() throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    // configure object mapper
    return objectMapper;
  }

  @Override
  public Class<?> getObjectType() {
    return ObjectMapper.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}
