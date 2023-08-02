package ch2.main;

import ch2.config.ProjectConfig;
import ch2.main.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println();
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        User user = context.getBean(User.class);
        System.out.println(user.getName());


//        System.out.println("Hello world");
//        Parrot p = new Parrot();
//        p.setName("NewName");
//        System.out.println(p.getName());
    }
}
