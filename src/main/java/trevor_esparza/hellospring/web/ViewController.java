package trevor_esparza.hellospring.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {


    @RequestMapping (path = {"/", "/about", "/posts", "/login", "/home"}, method = RequestMethod.GET)
    public String showView(){
        return "forward:/index.html";
    }


}
