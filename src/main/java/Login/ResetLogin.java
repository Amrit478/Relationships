package Login;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/*This class is used after user is successful login and than this class is accept the
* Id and than see what the user is like admin, teacher or student and allow him the
* permission based on that*/
@Entity
@Table(name = "ID")
public class ResetLogin {
    /*I will ask 4 digit pin and their name and try to locate the username
    * and for password reset I will send them email and they can reset the
    * password*/


}
