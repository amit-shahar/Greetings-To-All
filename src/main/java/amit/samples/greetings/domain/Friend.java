package amit.samples.greetings.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friend {
    @Id
    private String phoneNumber;

    private String name;
    private String birthday;
    private int luckyNumber;

    public Friend() {
    }

    public Friend(String phoneNumber, String name, String birthday, int luckyNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.birthday = birthday;
        this.luckyNumber = luckyNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
//
//    public void setPhoneNumber(Integer phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public int getLuckyNumber() {
//        return luckyNumber;
//    }
//
//    public void setLuckyNumber(int luckyNumber) {
//        this.luckyNumber = luckyNumber;
//    }
}
