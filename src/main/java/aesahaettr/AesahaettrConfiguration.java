package aesahaettr;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class AesahaettrConfiguration {

    // Nothing for now.

}
