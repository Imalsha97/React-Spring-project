package springproj.backend.model;

import javax.persistence.*;

@Entity
@Table(name= "User")
public class User {

    @Id
    private long id;

    private String email;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;




    public User() {
    }

    public User(long id,String email, String firstName, String lastName) {
        super();
//        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
