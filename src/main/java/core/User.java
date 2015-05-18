package core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * Created by teithun on 18.05.2015.
 */
public class User {

    @JsonProperty
    @NotEmpty
    private String email;

    @JsonProperty
    @NotEmpty
    private String password;

    @JsonProperty
    @NotEmpty
    private Date dateCreated;

    public User() {

    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}