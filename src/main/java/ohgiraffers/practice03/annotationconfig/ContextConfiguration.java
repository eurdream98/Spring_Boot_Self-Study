package ohgiraffers.practice03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ohgiraffers.practice03.annotationconfig")
public class ContextConfiguration {
}
