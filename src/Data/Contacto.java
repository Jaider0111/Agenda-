package Data;

import java.io.Serializable;

public class Contacto implements Serializable{
    private String nombre;
    private int numeroTel;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Contacto(String nombre, int numeroTel, String correo) {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.correo = correo;
    }
}
