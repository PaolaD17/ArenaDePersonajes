package Personajes;

public abstract class Personaje {

    private static int contador = 0;
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
        this.salud = salud;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    @Override
    public String toString(){
        return
                "Id: " + id +
                "- Nombre: " + nombre +
                "- Salud: " + salud +
                "- Nivel: " + nivel;
    }

    public Personaje(String nombre, int salud, int nivel){
        this.id = ++contador;
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }
}
