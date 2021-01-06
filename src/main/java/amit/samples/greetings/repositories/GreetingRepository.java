package amit.samples.greetings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import amit.samples.greetings.domain.Greeting;

public interface GreetingRepository extends JpaRepository <Greeting,Integer>{

    Greeting findGreetingById(Integer id);

}
