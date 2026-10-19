import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Submenu submenu = new Submenu();
    private int optSubmenu = 0 ;
    private int premiumCounter = 0;


    public  void optionHandler(int opt){

        if (opt == 1) {
            System.out.println(
                "---PRODUCTOS BASICOS---\n" +
                "1.Agua saborizada: 2,000$\n" +
                "2.Jabon protex: 5,000$\n" +
                "3.Chocolatina jet: 4,600$\n" +
                "-----------------------\n" 
            );
            if (sc.hasNextInt()) {
                optSubmenu = sc.nextInt();
                submenu.basicHandler(optSubmenu);
                System.out.println("producto agregado al carrito.");
            }
            else{
                System.out.println("Digite una opcion valida.");
            }
            
            
        }else if (opt == 2) {
            System.out.println(
                "---PRODUCTOS MEDIOS---\n" +
                "1.Avena: 10,000$\n" +
                "2.Arroz x2000g: 11,000$\n" +
                "3.Canasta de Huevos AA x30u: 16,000$\n" +
                "-----------------------\n" 
            );
            if (sc.hasNextInt()) {
                optSubmenu = sc.nextInt();
                submenu.mediumHandler(optSubmenu);
                System.out.println("producto agregado al carrito.");
            }
            else{
                System.out.println("Digite una opcion valida.");
            }

        }else if (opt == 3) {
            this.premiumCounter++;
            System.out.println(
                "---PRODUCTOS PREMIUM---\n" +
                "1.Pollito del Ara: 25,000$\n" +
                "2.Botella de Vino: 80,000$\n" +
                "3.Carne de res lomo fino X500g: 20,600$\n" +
                "-----------------------\n" 
            );
            if (sc.hasNextInt()) {
                optSubmenu = sc.nextInt();
                submenu.premiumHandler(optSubmenu);
                System.out.println("producto agregado al carrito.");
            }
            else{
                System.out.println("Digite una opcion valida.");
            }
        }
    }
    
    public int getPremiumCounter(){
        return this.premiumCounter;
    }

    public void printResult() {
    
        double subtotal = submenu.getSubTotal();
        double desc = 0;
        double tasaIVA = 0.19;
    
        if (subtotal > 100000) {
            desc = subtotal * 0.10;
        }
    
        double subtotalDesc = subtotal - desc;
        double IVA = subtotalDesc * tasaIVA;
        double total = subtotalDesc + IVA;
    
        System.out.println("----------------- FACTURA -----------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: " + desc);
        System.out.println("IVA (19%): $" + IVA);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Total productos premium:" + this.getPremiumCounter());
        System.out.println("-------------------------------------------");
    }


}



