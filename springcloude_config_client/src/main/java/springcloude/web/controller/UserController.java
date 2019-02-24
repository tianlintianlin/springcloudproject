package springcloude.web.controller;

import com.baidu.springcloude.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {
    @RequestMapping("/user/{id}")
    @HystrixCommand(fallbackMethod = "fallback")
    public User getUser(@PathVariable("id") Long id) {
        if (id==2){
            throw new RuntimeException("有错误");
        }
        // 正常应该调用service获取用户,现在模拟一下
        return new User(id, "mc");
    }
    public User fallback(Long id){
        return new User(id,"服务器崩溃了");
    }
}
