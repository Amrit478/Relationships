package Login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/*This class just defines the main purpose to check the username and password and if
* it matches with the database than it allows otherwise it will not allow the username
* and password and ask them to reset the username or password*/
@Entity
@Table(name = "Login")
public class Login {
    @NotNull
    @Size(min = 4, max = 100)
    @Column(unique = true, nullable = false)
    public String Username;
    @NotNull
    @Size(min = 8, max = 14)
    @Column(nullable = false, unique = true)
    public String password;
}
