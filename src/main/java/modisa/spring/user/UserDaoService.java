package modisa.spring.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    //Find all users
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Modisa", LocalDate.now().minusYears(30)));
        users.add(new User(1, "Tumi", LocalDate.now().minusYears(25)));
        users.add(new User(1, "Manana", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }
}
