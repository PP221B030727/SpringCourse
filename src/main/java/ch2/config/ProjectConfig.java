package ch2.config;

import ch2.main.Parrot;
import ch2.main.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var parrot = new Parrot();
        parrot.setName("CocO");
        return parrot;
    }
    @Bean
    Parrot parrot1(){
        var parrot = new Parrot();
        parrot.setName("CocO");
        return parrot;
    }
    @Bean
    Parrot parrot2(){
        var parrot = new Parrot();
        parrot.setName("CocO");
        return parrot;
    }


    @Bean
    User user(){
        var user = new User();
        user.setName("Nursultan");
        return user;
    }
    @Bean
    String hello(){
        return "Hello world";
    }
    @Bean
    Integer getTen(){
        return 10;
    }
}
