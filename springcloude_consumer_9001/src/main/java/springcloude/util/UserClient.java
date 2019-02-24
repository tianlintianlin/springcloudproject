package springcloude.util;

import com.baidu.springcloude.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-PROVIDER",fallbackFactory = UserClientHystrixFallbackFactory.class)
@RequestMapping("/provider")
public interface UserClient {
    @RequestMapping("/user/{id}") //user/1
    User getUser(@PathVariable("id") Long id);
}