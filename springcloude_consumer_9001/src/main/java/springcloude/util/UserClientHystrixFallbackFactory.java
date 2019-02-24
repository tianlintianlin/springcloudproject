package springcloude.util;

import com.baidu.springcloude.domain.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientHystrixFallbackFactory implements FallbackFactory<UserClient> {
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            public User getUser(Long id) {
                return new User(id,"服务器炸了");
            }
        };
    }
}
