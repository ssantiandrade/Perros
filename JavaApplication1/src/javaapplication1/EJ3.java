package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javaapplication1.Perro;

public class EJ3 {
    
    public static void main(String[] args) {
        
        System.out.println("      *** MENU ***");
        
        String nombre;
        String raza;
        String color;
        double edad;
        double peso;
        
        Scanner scan=new Scanner (System.in);
        
        ArrayList lista=new ArrayList ();
        
        System.out.println("Ingrese 1 para agregar un perro a la lista");
        System.out.println("Ingrese 2 para elimar un perro de la lista");
        System.out.println("Ingrese 3 para modificar los datos de un perro de la lista");
        System.out.println("Ingrese 4 para ver las acciones de los perros");
        System.out.println("Ingrese 5 para ");
        
        int op = scan.nextInt();
        int pos = 0;
        
        while (op>0 && op<5) {
        
            switch (op){
                
                case 1:
                    System.out.println("Ingrese el nombre del perro");
                    scan.nextLine();
                    nombre=scan.nextLine();
                    System.out.println("Ingrese la raza del perro");
                    raza=scan.nextLine();
                    System.out.println("Ingrese el color del perro");
                    color=scan.nextLine();
                    System.out.println("Ingrese la edad del perro");
                    edad=scan.nextDouble();
                    System.out.println("Ingrese el peso del perro");
                    peso=scan.nextDouble();
                    
                    lista.add(new Perro(nombre,raza,color,edad,peso));
                    
                break;
                
                case 2:
                    if(lista.size()!=0){
                        
                    System.out.println("Hay "+lista.size()+" perros en la lista");
                    System.out.println("Ingrese la posicion de la lista q desea eliminar");
                    pos=scan.nextInt();
                    lista.remove(pos);
                    }else{
                        System.out.println("No hay perros en la lista");
                    }
                break;
                
                case 3:
                    if(lista.size()!=0){
                        
                    for (int i=0;i<lista.size();i++){
                        System.out.println(lista.get(i).toString());
                    }
                    System.out.println("Elija un perro para cambiar los datos, tenga en cuenta que el primer perro tiene la posicion *0*"); 
                    pos=scan.nextInt();
                    System.out.println("Ingrese el nombre del perro");
                    scan.nextLine();
                    nombre=scan.nextLine();
                    System.out.println("Ingrese la raza del perro");
                    raza=scan.nextLine();
                    System.out.println("Ingrese el color del perro");
                    color=scan.nextLine();
                    System.out.println("Ingrese la edad del perro");
                    edad=scan.nextDouble();
                    System.out.println("Ingrese el peso del perro");
                    peso=scan.nextDouble();
                    
                    lista.set(pos, new Perro(nombre,raza,color,edad,peso));
                    }else{
                        System.out.println("No hay perros en la lista");
                    }
                break;
                
                case 4:
                    if(lista.size()!=0){

                    System.out.println("Elija la accion del perro");
                    System.out.println("1) Comer");
                    System.out.println("2) Correr");
                    System.out.println("3) Cagar");
                    
                    int ac = scan.nextInt();
                            
                    switch (ac){
                        
                        case 1:
                            System.out.println("Ingrese que perro quiere que coma");
                            for (int i=0;i<lista.size();i++){
                                System.out.println(lista.get(i).toString());
                            }
                            int num = scan.nextInt();
                        
                            System.out.println("Ingrese cuant quiere que coma el perro");
                            int cant = scan.nextInt();
                            //lista.get(num).perro.comer(cant);
                        break;    
                    }
                    }else{
                        System.out.println("No hay perros en la lista");
                    }
                break;
     }
        System.out.println("Ingrese 1 para agregar un perro a la lista");
        System.out.println("Ingrese 2 para elimar un perro de la lista");
        System.out.println("Ingrese 3 para modificar los datos de un perro de la lista");
        System.out.println("Ingrese 4 para salir");
        
        op = scan.nextInt();
    }
}
}
    
    

