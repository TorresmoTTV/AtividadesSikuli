package Atividade2;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;



public class Atividade2 {

    public static void main(String[] args) throws InterruptedException {
        Screen s = new Screen();
        try {
            if (s.exists("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/chrome.png",5) != null){
                s.doubleClick("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/chrome.png");
            } else {
                s.type(Key.WIN);
                s.type("chrome");
                s.type(Key.ENTER);
            }
            s.wait("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/digitarhyperlink.png", 10);
            s.type("senacrs.com.br/faleconosco");
            s.type(Key.ENTER);
            Thread.sleep(7000);
            s.wait("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/nome.png", 20);
            s.click("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/nome.png");
            s.type("Luis Felipe Roman Lembi");
            s.type(Key.TAB);
            s.type("12345678");
            s.type(Key.TAB);
            s.type("teste@teste.com");
            s.type(Key.TAB);
            s.type("555555555555");
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type("Porto Alegre");
            Thread.sleep(2000);
            s.click("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/portoalegre");
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.ENTER);
            s.click("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/curso");
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.ENTER);
            s.click("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/assunto");
            s.click("C://Users/182310076/Desktop/POO/JavaApplication3/src/img/Mensagem");
            s.type("Nao, nao, acho que nao.");
            s.type(Key.TAB);
            s.type(Key.ENTER);
            Thread.sleep(2000);
            s.type(Key.PRINTSCREEN);
            Thread.sleep(2000);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.ENTER);
            
        } catch (FindFailed ex) {

            System.out.println("Deu Ruim" + ex.getMessage());
            s.type(Key.PRINTSCREEN);
            Thread.sleep(2000);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.TAB);
            s.type(Key.ENTER);
        }
    }
}
