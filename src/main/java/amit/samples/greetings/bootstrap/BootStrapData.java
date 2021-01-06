package amit.samples.greetings.bootstrap;

import amit.samples.greetings.domain.Greeting;
import amit.samples.greetings.repositories.GreetingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final GreetingRepository greetingRepository;

    public BootStrapData(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Strarted in Bootstrap");

        Greeting greeting = new Greeting();

        greeting.setId(1);
        greeting.setName("birthday");
        greeting.setContent("Happy birthday!");
        greetingRepository.save(greeting);

        greeting.setId(2);
        greeting.setName("good day");
        greeting.setContent("Have a good day!");
        greetingRepository.save(greeting);

        greeting.setId(3);
        greeting.setName("gday");
        greeting.setContent("G'day!");
        greetingRepository.save(greeting);

        greeting.setId(4);
        greeting.setName("hows");
        greeting.setContent("How's it going?");
        greetingRepository.save(greeting);

        greeting.setId(5);
        greeting.setName("whatsup");
        greeting.setContent("What's up?");
        greetingRepository.save(greeting);

        greeting.setId(6);
        greeting.setName("longtime");
        greeting.setContent("Long time no see!");
        greetingRepository.save(greeting);

        greeting.setId(7);
        greeting.setName("hiya");
        greeting.setContent("Hiya!");
        greetingRepository.save(greeting);

        greeting.setId(8);
        greeting.setName("sup");
        greeting.setContent("Sup?");
        greetingRepository.save(greeting);

        greeting.setId(9);
        greeting.setName("awesome");
        greeting.setContent("You are awesome!");
        greetingRepository.save(greeting);

        greeting.setId(10);
        greeting.setName("ten");
        greeting.setContent("You are ten out of ten!");
        greetingRepository.save(greeting);

    }
}