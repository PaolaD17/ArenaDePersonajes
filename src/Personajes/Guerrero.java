package Personajes;

public class Guerrero extends Personaje {

    private int fuerza;

    public int getFuerza(){
        return this.fuerza;
    }
    public void setFuerza(int fuerza) {
        if (fuerza < 1 || fuerza > 50) throw new IllegalArgumentException("Fuerza inválida");
        this.fuerza = fuerza;
    }

    @Override
    public int calcularDañoBasico() {
        return (fuerza * getNivel()) / 2;
    }

    @Override
    public String resumen() {
        return super.resumen() + ", Fuerza: " + fuerza + ", Daño: " + calcularDañoBasico();
    }

    public Guerrero(String nombre, int salud, int nivel, int fuerza) {
        super(nombre, salud, nivel);
        if (fuerza < 1 || fuerza > 50) throw new IllegalArgumentException("Fuerza fuera de rango");
        this.fuerza = fuerza;
    }
}
