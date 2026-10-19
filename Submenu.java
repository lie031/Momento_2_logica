public class Submenu {

    private double subtotal = 0;

    public void basicHandler(int optSubmenu) {

        if (optSubmenu == 1) {
            subtotal += 2000;
        } else if (optSubmenu == 2) {
            subtotal += 5000;
        } else if (optSubmenu == 3) {
            subtotal += 4600;
        }
    }

    public void mediumHandler(int optSubmenu) {
        if (optSubmenu == 1) {
            subtotal += 10000;
        } else if (optSubmenu == 2) {
            subtotal += 11000;
        } else if (optSubmenu == 3) {
            subtotal += 16000;
        }
    }

    public void premiumHandler(int optSubmenu) {
        if (optSubmenu == 1) {
            subtotal += 25000;
        } else if (optSubmenu == 2) {
            subtotal += 80000;
        } else if (optSubmenu == 3) {
            subtotal += 20600;
        }
    }

    public double getSubTotal(){
        return this.subtotal;
    }

}
