package MainClass.movieen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {


<<<<<<< HEAD
    public List<String>  list= List.of("kabadi","football","circket","boxing" ,"Divya");
=======
    public List<String>  list= List.of("kabadi","football","circket","boxing");
>>>>>>> b57e9f79ae9599c8207bd669e592c524a9b7ce65

    @GetMapping("/gethabits")
    public List<String> habits(){

        return list;


    }

    @GetMapping("/message")
    public String msg(){
        return " hello world";

    }
}
