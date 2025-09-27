package Personajes;

public class Arquero extends Personaje{

    private int precision;

    public int getPrecision(){
        return precision;
    }
    public void setPrecision(int precision){
        this.precision = precision;
    }

    @Override
    public String toString(){
        return "Arquero: " + super.toString() + "- Precisión: " + this.precision;
    }

    public Arquero(String nombre, int salud, int nivel, int precision){
        super(nombre, salud, nivel);
        this.precision = precision;
    }
}
