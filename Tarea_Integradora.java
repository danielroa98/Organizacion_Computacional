import java.util.*;

public class Tarea_Integradora
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);

    String a = "A", b = "B", c = "C";
    String opcion, codigo;
    String cod = "cod", dec = "dec";

    System.out.println("Que va a hacer? Codificar o Decodificar?");
    System.out.println(" ");
    System.out.println("Por favor, solo escriba "+cod+" para Codificar o "+dec+" para Decodificar");
    System.out.println(" ");
    System.out.print("Inserte aqui el comando: ");
    opcion = lectura.nextLine();

//if usado para codificar la oración
    if(opcion.equalsIgnoreCase("COD"))
    {
      System.out.println("Inserte el texto que se va a codificar");
      codigo = lectura.nextLine();

      System.out.println(codigo);
    }

//else usado para decodificar la oración
    else if(opcion.equalsIgnoreCase("DEC"))
    {
      System.out.println("Inserte el texto que se va a decodificar");
      codigo = lectura.nextLine();

      System.out.println(codigo);
    }

  }
}
