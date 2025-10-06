package Personajes;

public class Arquero extends Personaje{

    private int precision;

    public int getPrecision(){
        return precision;
    }
    public void setPrecision(int precision) {
        if (precision < 1 || precision > 50) throw new IllegalArgumentException("Precisión inválida");
        this.precision = precision;
    }

    @Override
    public int calcularDañoBasico() {
        return (precision * getNivel()) / 2;
    }

    @Override
    public String resumen() {
        return super.resumen() + ", Precisión: " + precision + ", Daño: " + calcularDañoBasico();
    }

    public Arquero(String nombre, int salud, int nivel, int precision) {
        super(nombre, salud, nivel);
        if (precision < 1 || precision > 50) throw new IllegalArgumentException("Precisión fuera de rango");
        this.precision = precision;
    }

    probandoo
}
