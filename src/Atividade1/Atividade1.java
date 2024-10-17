package Atividade1;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Atividade1 {

    public static void main(String[] args) {
        Screen s = new Screen();
        try {
        s.click("C://Users/182310076/Desktop/Sikulie/AbrirImagem.sikuli/1729081582365");
        s.click("C://Users/182310076/Desktop/Sikulie/AbrirImagem.sikuli/1729081607935");
        s.doubleClick("C://Users/182310076/Desktop/Sikulie/AbrirImagem.sikuli/1729081619756");

        } catch (FindFailed ex) {
            System.out.println("Deu Ruim" + ex.getMessage());
        }
    }
}
