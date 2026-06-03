package MainClass.movieen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = {"Models", "com.example.movie"})
@SpringBootApplication
//@ComponentScan(basePackages = "com.Controller")
public class MovieEnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieEnApplication.class, args);
        System.out.print("server is running....");
    }


}
