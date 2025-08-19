package Payments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/*This class is used after user is successful login and than this class is accept the
* Id and than see what the user is like admin, teacher or student and allow him the
* permission based on that*/
@Entity
@Table(name = "ID")
public class Id {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


}
