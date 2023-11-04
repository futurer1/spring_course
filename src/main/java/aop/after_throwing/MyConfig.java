package aop.after_throwing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop.after_throwing")
@EnableAspectJAutoProxy
public class MyConfig {
}
