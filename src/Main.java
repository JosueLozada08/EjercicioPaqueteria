import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz principalForm = new Interfaz();
                principalForm.setTitle("Interfaz");
                principalForm.setBounds(200, 200, 800, 500);
                principalForm.setVisible(true);
                principalForm.setDefaultCloseOperation(principalForm.EXIT_ON_CLOSE);
            }
        });

    }
}