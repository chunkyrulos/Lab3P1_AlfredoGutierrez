/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_alfredogutierrez;
import java.util.Scanner;
/**
 *
 * @author Alfredo Gutierrez
 */
public class Lab3P1_AlfredoGutierrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean repetir_menu = true;
        
        while(repetir_menu){
            System.out.println("|||Menú|||");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. OK Boomer");
            System.out.println("4. Salir");
       
            int opcion = 0;
            opcion = sc.nextInt();
            
            


            switch(opcion){
                case 1:
                    
                    System.out.println("Puntos a ingresar: ");
                    int puntos = 0;
                    puntos = sc.nextInt();
                    
                    double raiz = 0;
                    for(int i = 1; i <= puntos; i++){
                        System.out.println("X: ");
                        double x = sc.nextInt();
                        System.out.println("Y: ");
                        double y = sc.nextInt();
                        
                        double ecuacion = (x - y);
                        double serie = Math.pow(ecuacion,2)
                                
                        
                                
                        sout           
                    }
                      
                    
                    
                    
                
                break;

                case 2: 
                    System.out.println(" Todavía en construcción...");
                
                break;

                case 3:
                    System.out.println("//Este método determina a que generación pertenecés//");
                    System.out.println("Ingresa tu año de nacimiento: ");
                    
                    int año;
                    año = sc.nextInt();

                    
                    if(año >= 1946 && año <= 1959){
                        System.out.println("¡Felicidades usted es de la Gen. Baby Boomer!");
                        
                    }else if(año >= 1960 && año <= 1974){
                        System.out.println("¡Felicidades usted es de la Generación X");
                                }
                    else if(año >= 1975 && año <= 1979){
                        System.out.println("!Felicidades usted es de la gen. Xennials");
                    }
                    else if(año >= 1980 && año <= 1989){
                        System.out.println("!Felicidades usted es de la gen. Millenials");
                    }
                    else if(año >= 1990 && año <= 2012){
                        System.out.println("!Felicidades usted es de la gen. Z");
                    }
                    else if(año >= 2013 && año <= 2025){
                        System.out.println("¡Felicidades usted es de la gen. Alpha");
                    }
                    
                    
                    
                    
                    






                break;
            }           
        } 
    } 
}

