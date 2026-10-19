public class Menu {

    int optSubmenu;
    
    public static void optionHandler(int opt){
        if (opt == 1) {
            System.out.println(
                "---PRODUCTOS BASICOS---\n" +
                "1.Agua saborizada: 2,000$\n" +
                "1.Jabon protex: 5,000$\n" +
                "3.Chocolatina jet: 4,600$\n" +
                "-----------------------\n" 
            );
        }else if (opt == 2) {
            System.out.println(
                "---PRODUCTOS MEDIOS---\n" +
                "1.Avena: 10,000$\n" +
                "1.Arroz x2000g: 11,000$\n" +
                "3.Canasta de Huevos AA x30u: 16,000$\n" +
                "-----------------------\n" 
            );
        }else if (opt == 3) {
            System.out.println(
                "---PRODUCTOS PREMIUM---\n" +
                "1.Pollito del Ara: 25,000$\n" +
                "1.Botella de Vino: 80,000$\n" +
                "3.Carne de res lomo fino X500g: 20,600$\n" +
                "-----------------------\n" 
            );
        }
    }


}



