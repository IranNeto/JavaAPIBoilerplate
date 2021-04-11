package com.example.examplecore.v1.resource;

import com.example.examplecore.v1.core.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;

import static com.example.examplecore.v1.resource.UserResource.USER_URI;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(USER_URI)
@RequestMapping(USER_URI)
public interface UserResource {

    final String USER_URI = "/api/v1/user/";

    @GET
    @GetMapping("/")
    @Produces(APPLICATION_JSON)
    ResponseEntity<Object> getAllUsers();

    @GET
    @GetMapping("/{id}")
    @Produces(APPLICATION_JSON)
    ResponseEntity<Object> getUserById(@PathVariable Long id);

    @POST
    @PostMapping("/")
    @Produces(APPLICATION_JSON) @Consumes(APPLICATION_JSON)
    ResponseEntity<Object> addUser(@RequestBody User user);

    @PUT
    @PutMapping("/{id}")
    @Produces(APPLICATION_JSON) @Consumes(APPLICATION_JSON)
    ResponseEntity<Object> updateUser(@RequestBody User user);

    @DELETE
    @DeleteMapping("/{id}")
    ResponseEntity<Object> deleteUser(@PathVariable Long id);
}
