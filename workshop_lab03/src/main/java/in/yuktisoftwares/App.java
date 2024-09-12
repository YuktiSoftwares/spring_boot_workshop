package in.yuktisoftwares;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1001);
        student.setName("Abc");
        student.setEmail("abc@gmail.com");
        student.setMobile("+91 9876543210");
        System.out.println(student);
    }
}
