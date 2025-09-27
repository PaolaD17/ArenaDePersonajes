package Personajes;

public class Mago extends Personaje {

    private int poder;
    private int mana;

    public int getPoder(){
        return poder;
    }
    public void setPoder(int poder) {
        if (poder < 1 || poder > 50) throw new IllegalArgumentException("Poder inválido");
        this.poder = poder;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana) {
        if (mana < 0 || mana > 100) throw new IllegalArgumentException("Mana inválido");
        this.mana = mana;
    }

    @Override
    public int calcularDañoBasico() {
        return (poder * getNivel()) / 3 + mana / 10;
    }

    @Override
    public String resumen() {
        return super.resumen() + ", Poder: " + poder + ", Mana: " + mana + ", Daño: " + calcularDañoBasico();
    }

    public Mago(String nombre, int salud, int nivel, int poder, int mana) {
        super(nombre, salud, nivel);
        if (poder < 1 || poder > 50) throw new IllegalArgumentException("Poder fuera de rango");
        if (mana < 0 || mana > 100) throw new IllegalArgumentException("Mana fuera de rango");
        this.poder = poder;
        this.mana = mana;
    }
}
