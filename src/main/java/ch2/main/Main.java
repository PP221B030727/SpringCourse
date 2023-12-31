package ch2.main;

import ch2.config.ProjectConfig;
import ch2.main.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cat someCat = context.getBean(Cat.class);

        var ourDog = new Dog();
        Supplier<Dog> dogSupplier = ()-> ourDog;
        context.registerBean("Sharik" , Dog.class , dogSupplier , dog->dog.setPrimary(true));


        Dog contextDog = context.getBean(Dog.class);
        System.out.println(contextDog.bark());

//        System.out.println(someCat);
//        String x = context.getBean(String.class);
//        System.out.println(context);
//        Integer myInt = context.getBean(Integer.class);
//        System.out.println(myInt);
//        Parrot parrot = context.getBean("Cococo",Parrot.class);
//        System.out.println(parrot.getName());




//        System.out.println();
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p.getName());
//        User user = context.getBean(User.class);
//        System.out.println(user.getName());



//        System.out.println("Hello world");
//        Parrot p = new Parrot();
//        p.setName("NewName");
//        System.out.println(p.getName());
    }
}
