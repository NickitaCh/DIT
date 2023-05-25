package apiClasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;

    public static User user() {
        return new User("NickNick", "Qwerty123", "test@test.test");
    }
}