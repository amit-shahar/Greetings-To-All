package amit.samples.greetings.Controllers;

import amit.samples.greetings.domain.Greeting;
import amit.samples.greetings.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public List<Greeting> getAllGreetings(){
        return greetingService.getAllGreetings();
    }

    @PostMapping
    public Greeting createGreeting(@RequestParam (value = "name") String name,
                                   @RequestParam (value = "content") String content){
        return greetingService.createGreeting(name,content);
    }

    @GetMapping("/{id}")
    public Greeting findGreetingById(@PathVariable Integer id){
        return greetingService.getGreetingById(id);
    }

}
