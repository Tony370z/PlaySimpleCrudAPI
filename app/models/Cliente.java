package models;

import io.ebean.Model;

import javax.persistence.*;

@Entity
public class Cliente extends Model{

    @Id
    public Integer id;
    public String dni;
    public String nombre;
    public String apellido;
    public String tlf;
    public String email;

    public Cliente() {
    }

    public Cliente(Integer id, String dni, String nombre, String apellido, String tlf, String email) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tlf = tlf;
        this.email = email;
    }
}
