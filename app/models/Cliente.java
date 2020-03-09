package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;

@Entity
public class Cliente extends Model {

    @Id
    public Integer id;
    public String dni;
    public String nombre;
    public String apellido;
    public String tlf;
    public String email;

    public static final Finder<Integer, Cliente> find = new Finder<>(Cliente.class);

}
