package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Klase {
    private String _failoVardas;
    private String _failoVardas2;
    private ArrayList<String> _arr;

    public Klase(String failoVardas) {
        this._failoVardas = failoVardas;
        this._arr = new ArrayList<>();
    }


    public void nuskaitytiFaila() {

        try {
            FileReader in = new FileReader(_failoVardas);
            BufferedReader bufferis = new BufferedReader(in);

            try {
                String sCurrentLine;
                while ((sCurrentLine = bufferis.readLine()) != null) {
                    this._arr.add(sCurrentLine);
                }
                bufferis.close();
                in.close();

            } catch (Exception e) {
                System.out.println("Kazkas negerai");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Nepavyko atidaryti failo");
        }
    }


    public void atvaizdavimasIsSaraso() {
        for (String part : this._arr) {
            System.out.println(part);
        }
    }
}
