package com.afhunt.adminservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "MBill Desktop",version = "v1",license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")))
public class OpenApiConfig {
}
