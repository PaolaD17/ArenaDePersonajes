package Personajes;

public abstract class Personaje {

    private int id;
    private String nombre;
    private int salud;
    private int nivel;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getSalud(){
        return salud;
    }
    public void setSalud(int salud){
        if (salud < 0 || salud > 100) throw new IllegalArgumentException("Salud fuera de rango");
        this.salud = salud;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        if (nivel < 1) throw new IllegalArgumentException("Nivel inválido");
        this.nivel = nivel;
    }

    public void recibirDaño(int puntos) {
        salud = Math.max(0, salud - puntos);
    }

    public void curar(int puntos) {
        salud = Math.min(100, salud + puntos);
    }

    public abstract int calcularDañoBasico();

    public String resumen() {
        return "Nombre: " + nombre + ", Salud: " + salud + ", Nivel: " + nivel;
    }

    @Override
    public String toString() {
        return resumen();
    }

    public Personaje(String nombre, int salud, int nivel){
        if (salud < 0 || salud > 100) throw new IllegalArgumentException("Salud fuera de rango (0–100)");
        if (nivel < 1) throw new IllegalArgumentException("Nivel debe ser >= 1");
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }
}
