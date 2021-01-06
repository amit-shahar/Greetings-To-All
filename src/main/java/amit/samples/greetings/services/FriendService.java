package amit.samples.greetings.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class FriendService {


    public boolean itsYourBirthday(String birthday_string)
    {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse(birthday_string,formatter);
        //return true if day and month are the same
        return((birthday.getDayOfMonth()==LocalDate.now().getDayOfMonth())&&(birthday.getMonth()==LocalDate.now().getMonth()));
    }
}
