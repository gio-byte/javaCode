import java.util.Scanner;
public class CalculadoraDeBonos
{
   public static void main(String[] args) {
      Scanner stdIn=new Scanner(System.in);
      int numero1;
      int numero2;
      System.out.print("introduce un numero: ");
      numero1=stdIn.nextInt();
      System.out.print("introduce otro numero: ");
      numero2=stdIn.nextInt();
      int suma=numero1+numero2;
      System.out.println("La suma de los numeros es: "+suma);
      stdIn.close();
   }
}