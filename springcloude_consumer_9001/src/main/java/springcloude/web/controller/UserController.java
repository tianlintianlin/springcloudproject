package springcloude.web.controller;

import com.baidu.springcloude.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloude.util.UserClient;

@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private UserClient userClient;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){
        return userClient.getUser(id);
    }
}
