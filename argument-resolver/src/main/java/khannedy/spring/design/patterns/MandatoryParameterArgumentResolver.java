package khannedy.spring.design.patterns;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MandatoryParameterArgumentResolver implements HandlerMethodArgumentResolver {

  @Override
  public boolean supportsParameter(MethodParameter methodParameter) {
    return MandatoryParameter.class.equals(methodParameter.getParameterType());
  }

  @Override
  public Object resolveArgument(MethodParameter methodParameter,
                                ModelAndViewContainer container,
                                NativeWebRequest request,
                                WebDataBinderFactory binderFactory)
    throws Exception {

    return MandatoryParameter.builder()
      .requestId(request.getHeader("X-Request-Id"))
      .serviceId(request.getHeader("X-Service-Id"))
      .userId(request.getHeader("X-User-Id"))
      .timestamp(Long.valueOf(request.getHeader("X-Timestamp")))
      .build();
  }
}
