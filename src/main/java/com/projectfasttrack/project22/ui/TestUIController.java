package com.projectfasttrack.project22.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestUIController {
    @GetMapping()
    String transactionsPage(Model model){
        System.out.println("Transactions page");
        model.addAttribute("message","This is Thymeleaf" );
        model.addAttribute("mySite","https://www.fasttrackit.org/");
        model.addAttribute("showName",true);
        model.addAttribute("name","Stefan");
        model.addAttribute("users", List.of(
                new User("Aurel", 22),
                new User("Maria", 11),
                new User("Dorel", 42),
                new User("Ioana", 33)
        ));
        return "test";
    }
}
class User{
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
