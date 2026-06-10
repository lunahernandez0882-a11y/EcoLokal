package luna.ecolokal;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/ola")
public class SaludoResource {

    @GET
    public String saludo() {
        return "Hola EcoLokal";
    }
}