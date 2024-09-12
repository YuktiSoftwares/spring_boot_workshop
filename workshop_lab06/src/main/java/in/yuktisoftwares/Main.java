package in.yuktisoftwares;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = (Student) context.getBean("student");
        student.setId(1001);
        student.setName("Abc");
        student.setEmail("abc@gmail.com");
        student.setMobile("+91 9876543210");
        System.out.println(student);
    }
}