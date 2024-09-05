package services.interfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SomeClass {

    @Bean
    public String testBean() {
        return "Spring is connected!";
    }

    public static void main(String[] args) {
        // Создание Spring-контекста
        ApplicationContext context = new AnnotationConfigApplicationContext(SomeClass.class);

        // Получение бина
        String message = context.getBean(String.class);
        System.out.println(message);  // Вывод "Spring is connected!"
    }
}
