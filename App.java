import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {

            System.out.println(
                            "************************************************************\n" +
                            "Bienvenido a Tiendas Ara - Alegria al mejor precio \n" +
                            "Por favor seleccione uno de las siguientes categorias:\n" +
                            "1. Productos básicos:\n" +
                            "2. Productos Medio:\n" +
                            "3. Productos Premium:\n" +
                            "4. Terminar Compra:\n" +
                            "************************************************************\n");

            if (sc.hasNextInt()) {
                option = sc.nextInt();

                switch (option) {
                    case 4:
                        System.out.println("Imprimiendo total compra...");
                        break;
                    case 1:

                    default:
                        break;
                }
            }else{
                System.out.println("Opcion incorrecta, ingrese un valor valido.");
            }

        } while (option != 4);

    }
}