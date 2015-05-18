package resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import core.User;
import dao.UserDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

/**
 * Created by teithun on 18.05.2015.
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class ShowUsersResource {

    private UserDAO userDAO;

    public ShowUsersResource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GET
    @Timed
    public Set<User> listAllUsers() {
        return userDAO.list();
    }
}
