package p1;

public class P1_main {
    public static void main(String[] args) {
        System.out.println("Hello from P1_main");
        Betrag b = new Betrag(13, 60);
        System.out.println("Betrag: " + b.getEuro() + " Euro und " + b.getCent() + " Cent");
        Betrag b2 = new Betrag(14, 80);
        Betrag bSum = summe(b, b2);
        System.out.println("Summe: " + bSum.getEuro() + " Euro und " + bSum.getCent() + " Cent");
    }

    public static Betrag summe(Betrag a, Betrag b) {
        int totalCent = a.getCent() + b.getCent();
        int totalEuro = a.getEuro() + b.getEuro();
        Betrag result = new Betrag(totalEuro, totalCent);
        return result;
    }
}
