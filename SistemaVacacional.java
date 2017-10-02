import java.util.Scanner;

public class SistemaVacacional{
public static void main (String args[]){

   Scanner wen = new Scanner(System.in);
   String nombre = "";
   int antiguedad = 0, clave = 0;
   System.out.println("********************************************************");
   System.out.println("*Bienvenidos al sistema vacacional de Coca-Cola Company*");
   System.out.println("********************************************************");
   System.out.println("");
   System.out.println("");
 
   System.out.println("¿Cùal es el nombre del trabajador?");
   nombre= wen.nextLine();
   System.out.println("");

   System.out.println("¿Cuantos años de antiguedad tiene el trabajador?");
   antiguedad= wen.nextInt();  
   System.out.println("");

   System.out.println("¿Cùal es la clave del departamento del trabajador?");
   clave= wen.nextInt();
   System.out.println("");

   if(clave==1){

     if(antiguedad == 1){
         System.out.println( nombre + " tiene derecho de 6 dias de vacaciones por su servicio");
    }else if(antiguedad >=2 && antiguedad <= 6){
         System.out.println( nombre + " tiene derecho de 14 dias de vacaciones por su de servicio");
    }else if(antiguedad >= 7){
         System.out.println( nombre + " tiene derecho de 20 dias de vacaciones por su servicio");
    }else{
         System.out.println( nombre + " no tiene derecho aun de vacaciones por su de servicio");
    }


   }else if(clave==2){

     if(antiguedad == 1){
         System.out.println( nombre + " tiene derecho de 7 dias de vacaciones por su servicio");
    }else if(antiguedad >=2 && antiguedad <= 6){
         System.out.println( nombre + " tiene derecho de 15 dias de vacaciones por su de servicio");
    }else if(antiguedad >= 7){
         System.out.println( nombre + " tiene derecho de 22 dias de vacaciones por su servicio");
    }else{
         System.out.println( nombre + " no tiene derecho aun de vacaciones por su de servicio");
    }
    
  }else if(clave==3){

     if(antiguedad == 1){
         System.out.println( nombre + " tiene derecho de 10 dias de vacaciones por su servicio");
    }else if(antiguedad >=2 && antiguedad <= 6){
         System.out.println( nombre + " tiene derecho de 20 dias de vacaciones por su de servicio");
    }else if(antiguedad >= 7){
         System.out.println( nombre + " tiene derecho de 30 dias de vacaciones por su servicio");
    }else{
         System.out.println( nombre + "  no tiene derecho aun de vacaciones por su de servicio  ");
    }
  }else {
    System.out.println( "introduciste una clave errada");
   
  }
 }
}