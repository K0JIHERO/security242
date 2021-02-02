package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
//    UserService userService = new UserServiceImpl();
    User user1 = new User(1, "Bob", "Lee", "torto@torto.tor");

    @GetMapping("/users")
    public String listOfUsers(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(user1);
//        userService.addUser(user1);
        model.addAttribute("users", userList);
        return "users";
    }
}
