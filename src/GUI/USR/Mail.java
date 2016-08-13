package GUI.USR;

import java.awt.*;
import java.io.IOException;
import java.net.URI;


public class Mail {

    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.mail();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String msg = "mailto:PersonalTrainer@GoldenEra.com?subject=Personal%20Trainer";
            URI uri = URI.create(msg);
            desktop.mail(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

