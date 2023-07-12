package red.dudu.swaggertext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration  {


    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("盈利宝项目")
                .version("1.0.0")
                .description("前后端分离项目")
                .contact(new Contact("小杰","com.xiaojie","1933823757@qq.com"))
                .license("apache 2.0")
                .build();
        Docket docket1 = docket.apiInfo(apiInfo);

        //设置文档与文档生成的包
        docket1 = docket.select().apis(RequestHandlerSelectors.basePackage("xiaojie.com.swaggertext.controller")).build();

        return docket1;

    }


}
