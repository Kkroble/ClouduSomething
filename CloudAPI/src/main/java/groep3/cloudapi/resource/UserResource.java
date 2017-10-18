package groep3.cloudapi.resource;

import groep3.cloudapi.model.User;
import groep3.cloudapi.presentation.model.UserPresenter;
import groep3.cloudapi.service.UserService;
import io.dropwizard.auth.Auth;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path( "/users" )
@Consumes ( MediaType.APPLICATION_JSON )
@Produces ( MediaType.APPLICATION_JSON )

public class UserResource extends BaseResource
{
    private final UserService userService;
    //private final UserPresenter userPresenter;
     
    @Inject

    public UserResource (UserService userService, UserPresenter userPresenter)
    {
        this.userService = userService;
       // this.userPresenter = userPresenter;
    }
    
    //Get Calls - User
    @GET
    public List <User> getAll(@Auth User authenticatedUser)
    {
        List<User> users = userService.GetAll();
        return users;
    }
    
    @GET
    @Path( "/{id}" )
    public User getUserById(@PathParam( "id") String id)
    {
        User user = userService.getUserById(id);
        return user;
    }
    
    @GET
    @Path( "/{id}/points")
    public int getPoints(@PathParam( "id") String id)
    {
        int points = userService.getPoints(id);
        return points;
    }
    
    //Post Calls - User
    @POST
    public User create(@Valid User newUser)
    {
        userService.create(newUser);
        return newUser;
    }
}
