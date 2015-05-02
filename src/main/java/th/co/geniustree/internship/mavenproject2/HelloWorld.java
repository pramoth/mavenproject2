package th.co.geniustree.internship.mavenproject2;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/")
    public String welcome(){
        return "Welcome tospring boot ";
    }
    @RequestMapping(value = "/private/sayhello")
    public String hello(@RequestParam(value="name",required = false) String name){
        return "Hello "+name;
    }
}
