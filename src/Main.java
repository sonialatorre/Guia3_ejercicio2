import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        String fin;
        Integer contacto1;

        do {
            System.out.println("Ingrese el numero de contacto");
            contacto1 = sc.nextInt();
            list.add(contacto1);

            System.out.println("si desea ingresar otro contacto escriba s, de lo contrario escriba no");
            fin = sc.next();


        } while (fin.equalsIgnoreCase("s"));
        System.out.println("el listado de contactos es: " + '\n'+ list);

    }
}



