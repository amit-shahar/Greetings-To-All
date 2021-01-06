package amit.samples.greetings.Controllers;

import amit.samples.greetings.repositories.FriendRepository;
import amit.samples.greetings.repositories.GreetingRepository;
import amit.samples.greetings.services.FriendService;
import amit.samples.greetings.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetme")
public class GreetMeController {

    private FriendService friendService;
    private GreetingService greetingService;

    @Autowired
    public GreetMeController(FriendService friendService, GreetingService greetingService) {
        this.friendService = friendService;
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    @ResponseBody
    public String home(){

        return "";
    }
}
