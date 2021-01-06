package amit.samples.greetings.services;

import amit.samples.greetings.domain.Greeting;
import amit.samples.greetings.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreetingById(int id)
    {
        //validation
        return greetingRepository.findGreetingById(id);
    }

    public Greeting createGreeting(String name, String content)
    {
        Greeting greeting = new Greeting(name,content);
        //validation
        greetingRepository.save(greeting);
        //add error
        return greeting;
    }

    public List<Greeting> getAllGreetings()
    {
        //validation
        return greetingRepository.findAll();
    }

}