package fidelity.clase_20.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;

import fidelity.clase_20.controllers.connections.api;

@Controller
public class UserController {
    
    @Autowired
    private api api;

    //@PreAuthorize("")
    //@RolesAllowed("ROLE_USER")     esta anotation viene de la mano de poner true a las anotaciones de jsr250
    public String createUserForm() {
        return "formUser";
    }

    @Secured({ "ROLE_USER", "ROLE_ADMIN" })
    public boolean isValidUsername(String email) {
        String temp = api.getUserName(email);
        if(temp != null) {
            return false;
        }
        return true;
    }
}
