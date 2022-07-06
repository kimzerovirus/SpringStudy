package me.kzv.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("loginPage")
    public String loginPage() {
        return "loginPage";
    }

    @GetMapping("user")
    public String user() {
        return "user";
    }

    @GetMapping("admin")
    public String admin(){
        return "Admin";
    }

    @GetMapping("admin/pay")
    public String adminPay() {
        return "adminPay";
    }
}
