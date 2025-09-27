package Personajes;

public class Guerrero extends Personaje {
    private int fuerza;

    public int getFuerza(){
        return this.fuerza;
    }
    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    @Override
    public String toString(){
        return "Guerrero: " + super.toString() + "- Fuerza: " + this.fuerza;
    }

    public Guerrero(String nombre, int salud, int nivel, int fuerza){
        super(nombre, salud, nivel);
        this.fuerza = fuerza;
    }
}
