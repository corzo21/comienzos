public class Promedio{
  public static void main(String args[]){
  
   int biologia = 1;   
   int  quimica = 2;
   int fisica = 1;
   float promedio = 0;
   promedio=(biologia+quimica+fisica)/3;
   
   
   if(promedio==2){
    System.out.println("Reprobaste, esfuerzate mas la siguiente" + promedio);
  }else if(promedio==3){ 
    System.out.println("Aprobaste, pero debes esforzarte mas la siguiente" + promedio);
  }else if(promedio>=4){
   System.out.println("Excelente , sigue asi Felicitaciones" + promedio);
  }
 }
}