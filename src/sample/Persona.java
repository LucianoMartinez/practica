package sample;

import sample.animales.Perro;

/**
 * Created by luciano on 03/05/2017.
 */
public class Persona {

    Perro mascotaPerro;
    String nombre;
    int edad;

    public Perro getMascotaPerro() {
        return mascotaPerro;
    }

    public void setMascotaPerro(Perro mascotaPerro) {
        this.mascotaPerro = mascotaPerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
