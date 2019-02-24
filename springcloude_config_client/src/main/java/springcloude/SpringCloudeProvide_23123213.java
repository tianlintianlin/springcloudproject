package springcloude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringCloudeProvide_23123213 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudeProvide_23123213.class);
    }
}
