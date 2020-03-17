1. 
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>

2.         
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket apis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.marlabs.employee"))
                //.paths(PathSelectors.ant("*/sample/*"))
                .build();
                
    }
}        

http://localhost:8081/swagger-ui.htm

http://localhost:8081/v2/api-docs -> To generate Swagger json file.

Import this json file into https://editor.swagger.io/

Click on Generate Client and select html2 to generate html output of documentation.





Use swagger-codegen to programatically generate 
swagger-codegen generate -i <path to your swagger file> -l html2 -o <path to output location>
https://stackoverflow.com/questions/26605217/generate-static-docs-with-swagger