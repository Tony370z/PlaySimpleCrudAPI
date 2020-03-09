package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Cliente;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result getById(Integer id) {
        Cliente cliente = Cliente.find.byId(id);
        return ok(Json.toJson(cliente));
    }

    public Result getAllByAny(Integer id, String dni, String nombre, String apellido, String tlf, String email) {

        JsonNode personJson = null;

        List<Cliente> clients = Cliente.find.query()
                .where()
                .or()
                .eq("id", id)
                .eq("dni", dni)
                .eq("nombre", nombre)
                .eq("apellido", apellido)
                .eq("tlf", tlf)
                .eq("email", email)
                .endOr()
                .findList();



//        return ok(personJson);
        return ok(Json.toJson(clients));
    }

}
