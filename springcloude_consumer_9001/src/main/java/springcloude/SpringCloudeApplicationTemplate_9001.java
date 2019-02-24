package springcloude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "springcloude") //扫描本地feign的接口
public class SpringCloudeApplicationTemplate_9001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudeApplicationTemplate_9001.class);
    }
}
