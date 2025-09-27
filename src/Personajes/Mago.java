package Personajes;

public class Mago extends Personaje {
    private int poder;
    private int mana;

    public int getPoder(){
        return poder;
    }
    public void setPoder(int poder){
        this.poder = poder;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        this.mana = mana;
    }

    @Override
    public String toString(){
        return "Mago: " + super.toString() + "- Poder: " + this.poder + "- Mana: " + this.mana;
    }

    public Mago(String nombre, int salud, int nivel, int poder, int mana){
        super(nombre, salud, nivel);
        this.poder = poder;
        this.mana = mana;
    }
}
