import java.util.*;

public class Tarea_Integradora {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String opcion, codigo;
        String cod = "cod", dec = "dec";
        int deco, caracter, cp, cant;
        int secreto;
        char car;
        //int secreto [];

        System.out.println("Que va a hacer? Codificar o Decodificar?");
        System.out.println("*");
        System.out.println("Por favor, solo escriba " + cod + " para Codificar o " + dec + " para Decodificar");
        System.out.println("*");
        System.out.print("Inserte aqui el comando: ");
        opcion = lectura.nextLine();

        //if usado para codificar la oración
        if (opcion.equalsIgnoreCase("COD")) {
            System.out.println("Inserte el texto que se va a codificar");
            codigo = lectura.nextLine();

            System.out.println("");
            for (int i = 0; i < codigo.length(); i++) {
                caracter = codigo.charAt(i);
                //System.out.printf("%c ", caracter);

                cp = codigo.codePointAt(i);
                secreto = cp * 9;

                System.out.printf(" %d ", secreto);

            }

        }

        //else usado para decodificar la oración
        else if (opcion.equalsIgnoreCase("DEC")) {
            System.out.println("Con cuantos caracteres cuenta su código?");
            cant = lectura.nextInt();

            for (int cont = 0; cont < cant; cont++) {
                System.out.println("Inserte su valor " + cont + ": ");
                deco = lectura.nextInt();

                secreto = deco / 9;

                car = (char)secreto;

                System.out.println("");
                System.out.println(" " + car);

            }
        }
    }
}
