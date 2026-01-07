package p2;

public class P2_main {
    public static void main(String[] args) {
        /* Ist in mainString das Wort abc gespeichert, dann bewirkt addPrefix("!"), dass in
mainString dann !abc gespeichert ist. Bei addPostfix("!") wird dementsprechend
dann abc! gespeichert sein. */
        String2 str = new String2("abc");
        System.out.println("Ursprünglicher String: " + str.toString());
        str.addPrefix("!");
        System.out.println("Nach addPrefix(\"!\"): " + str.toString());
        str.addPostfix("!");
        System.out.println("Nach addPostfix(\"!\"): " + str.toString());
    }
}
