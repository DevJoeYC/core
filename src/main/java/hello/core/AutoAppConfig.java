package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        /*basePackages = "hello.core",
        basePackageClasses = AutoAppConfig.class,*/
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //AppConfig 및 예제 코드들 때문에 필터링
public class AutoAppConfig {

}
