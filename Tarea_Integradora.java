import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Tarea_Integradora {
    public static void main(String[] args) throws IOException
    {
        Scanner lectura = new Scanner(System.in);

        File archivo;

        archivo = new File("HojaSecreta.txt");

        FileWriter escritor = new FileWriter(archivo, true);

        String opcion, codigo, completo;
        String cod = "cod", dec = "dec";
        int deco, caracter, cp, cant;
        int secreto;
        char car;
        //int secreto [];


        JOptionPane.showMessageDialog(null, "Bienvenido al sistema para Codificar o Decodificar frases!", "Inicio", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("");
        JOptionPane.showMessageDialog(null, "Que desea? Codificar o Decodificar?", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);

        //System.out.println("Que va a hacer? Codificar o Decodificar?");

        JOptionPane.showMessageDialog(null, "Escriba COD para codificar su texto o escriba DEC para decodificarlo", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);

        //System.out.println(" ");
        //System.out.println("Por favor, solo escriba " + cod + " para Codificar o " + dec + " para Decodificar");
        //System.out.println(" ");
        //System.out.print("Inserte aqui el comando: ");
        //opcion = lectura.nextLine();

        opcion = JOptionPane.showInputDialog(null, "Escriba el comando a continuación:", "Inicio", JOptionPane.QUESTION_MESSAGE);

        //System.out.println("");

        PrintWriter pw = new PrintWriter(escritor);

        //if usado para codificar la oración
        if (opcion.equalsIgnoreCase("COD")) {
            //System.out.println("Inserte el texto que se va a codificar");
            codigo = JOptionPane.showInputDialog(null, "Inserte el texto que se va a codificar", "CODIFICACION", JOptionPane.QUESTION_MESSAGE);

            //System.out.println("");
            for (int i = 0; i < codigo.length(); i++) {
                caracter = codigo.charAt(i);
                //System.out.printf("%c ", caracter);

                cp = codigo.codePointAt(i);
                secreto = cp * 9;

                //System.out.printf(" %d ", secreto);


                System.out.printf("%d-", secreto);

                JOptionPane.showMessageDialog(null, "Sus valores secretos son: "+secreto, "CODIFICACION", JOptionPane.INFORMATION_MESSAGE);

                //pw.printf("\nTu dígito es: %d \t", secreto);

              }

            }
            //else usado para decodificar la oración
        else if (opcion.equalsIgnoreCase("DEC")) {
            //System.out.println("Con cuantos caracteres cuenta su código?");

            JOptionPane.showMessageDialog(null, "Tome en consideración que si desea traducir 4 caracteres, debe escribir 3 en la casilla siguiente por como lo percibe el sistema.", "DECODIFICACION", JOptionPane.INFORMATION_MESSAGE);


            cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte los digitos que se van a decodificar", "DECODIFICACION", JOptionPane.QUESTION_MESSAGE));

            for (int cont = 0; cont <= cant; cont++) {
                //System.out.print(" ");

                deco = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertelos a continuación: ", "DECODIFICACION", JOptionPane.QUESTION_MESSAGE));

                secreto = deco / 9;

                car = (char)secreto;

                //System.out.println("");
                //System.out.println(" " + car);

                completo = Character.toString(car);

                String[] frase = new String[] {completo};

                //System.out.println(frase[]);
                System.out.printf("%s", completo);
                //JOptionPane.showMessageDialog(null, "Sus valores decodificados son: "+completo, "DECODIFICACION", JOptionPane.INFORMATION_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Por favor, abra la terminal donde corrió este programa ", "Shhh", JOptionPane.INFORMATION_MESSAGE);


            JOptionPane.showMessageDialog(null, "Espero que el servicio haya sido de su agrado!", "FIN", JOptionPane.INFORMATION_MESSAGE);


        }
        System.out.println(" ");

        escritor.close();

        System.exit(0);
    }
}
