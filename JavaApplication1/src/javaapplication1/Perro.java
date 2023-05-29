package javaapplication1;

public class Perro {   
        String nombre;
        String raza;
        String color;
        double edad;
        double peso;
        
    public Perro(String nombre, String raza, String color, double edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    public void comer(int pesoextra){
        peso=peso+pesoextra;
    }
    
    public void correr(int minutos){
        peso=peso-(0.8*minutos)/100;
    }
    
    public void cagar(){
        peso=peso-0.50;
    }
}
