package amit.samples.greetings.repositories;

import amit.samples.greetings.domain.Friend;
import amit.samples.greetings.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend,Integer>{
}

