package Data;

import java.io.Serializable;
import java.util.*;

public class Agenda implements Serializable{
    private String ubicacion;
    private String nombre;
    private ArrayList contactos;

    public String getNombre() {
        return nombre;
    }

    public ArrayList getContactos() {
        return contactos;
    }

    public String getUbicacion() {
        return ubicacion;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContactos(ArrayList contactos) {
        this.contactos = contactos;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Agenda(String ubicacion, String nombre, ArrayList contactos) {
        this.nombre = nombre;
        this.contactos = contactos;
        this.ubicacion = ubicacion;
    }
}
