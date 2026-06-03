package MainClass.movieen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {


    public List<String>  list= List.of("kabadi","football","circket","boxing");

    @GetMapping("/gethabits")
    public List<String> habits(){

        return list;


    }

    @GetMapping("/message")
    public String msg(){
        return " hello world";

    }
}
