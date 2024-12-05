package in.yuktisoftwares;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Student student = new Student();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Student student = (Student) applicationContext.getBean("student");


        student.setId(101);
        student.setName("Abc");
        student.setEmail("abc@gmail.com");
        student.setMobile("+91 9876543210");


        Query query = (Query) applicationContext.getBean("query");
        query.setId(1001);
        query.setDescription("What is Spring Boot?");
        query.setStatus("OPEN");
        query.setStudentId(101);
        System.out.println(student);
        System.out.println(query);
    }
}
