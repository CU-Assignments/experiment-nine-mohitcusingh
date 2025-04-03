import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context from configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Get the Student bean
        Student student = context.getBean(Student.class);
        
        // Print student details
        student.printStudentDetails();
        
        // Close the context
        context.close();
    }
}
