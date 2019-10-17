package khannedy.spring.design.patterns;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

  @GetMapping("/api/products/{id}")
  public Product get(@PathVariable("id") String id,
                     MandatoryParameter mandatoryParameter) {
    // your logic here
    return null;
  }

}
