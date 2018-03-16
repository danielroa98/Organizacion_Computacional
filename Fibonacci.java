import java.util.Scanner;

public class Fibonacci
{
 public static void main(String[] args)
 {
  int n, a = 0, b = 0, c = 1;

  Scanner lectura = new Scanner(System.in);

  System.out.print("Escriba hasta que valor de la secuencia desea llegar: ");
  n = lectura.nextInt();

  System.out.print("La secuencia hasta " + n + " es: ");

  for (int i = 1; i <= n; i++)
  {
    a = b;
    b = c;
    c = a + b;
    System.out.print(a + " ");
  }

  /*-------OUTPUT----*/
  /*
    C:\Users\danie\Favorites\Programacion\JAVA\Organizacion Computacional>java Fibonacci
    Escriba hasta que valor de la secuencia desea llegar: 7
    La secuencia hasta 7 es: 0 1 1 2 3 5 8
  */
 }
}
