package lt.eimantas;

public class Main {

    public static final String FILE_NAME = "vardai.txt";
    public static final String FILE_NAME2 = "pavardes.txt";


    public Main() {
        Klase obj = new Klase(Main.FILE_NAME2);

        obj.nuskaitytiFaila();
        obj.atvaizdavimasIsSaraso();
    }

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();

    }
}
