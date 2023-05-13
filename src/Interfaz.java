import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTabbedPane tabbedPane1;
    private javax.swing.JPanel JPanel;
    private JTextField calleEnvio;
    private JTextField CiudadEnvio;
    private JTextField EstadoEnvio;
    private JTextField CodigoPostalEnvio;
    private JTextField CalleDestino;
    private JTextField CiudadDestino;
    private JTextField EstadoDestino;
    private JTextField CodigoPostalDestno;
    private JTextField Dia;
    private JTextField Año;
    private JTextField Mes;
    private JTextField rpaquete;
    private JButton continuarButton;
    private JButton mostrarButton;
    private JButton mostrarDatosButton;
    private JTabbedPane tabbedPane2;
    private JTextArea textArea2;
    private JTextArea textArea1;
    private JTabbedPane tabbedPane3;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JButton buscarButton;
    private JTextField textField17;
    private JTextArea textArea3;
    private JButton buscarButton1;
    private JTextField textField18;
    private JButton crearButton;

    TrackingSystem ts = new TrackingSystem();

    public Interfaz() {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crear();
            }
        });
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();

            }

        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar();
            }
        });
        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quemardatos();
            }
        });
    }
    private void Quemardatos() {
        String text = "";

        


    }

    private void mostrar(){
        String text = "";
        if(ts.getPackages().size() > 0){
            for(int i = 0; i < ts.getPackages().size(); i++){
                text += ts.getPackages().get(i).toString();
            }
            textArea1.setText(text);
        }else{
            textArea1.setText("No hay paquetes en el sistema.");
        }
    }
    private void eliminar ()
    {
        if(ts.removePackage(rpaquete.getText())){
            JOptionPane.showMessageDialog(null, "El paquete " + rpaquete.getText() + " se ha eliminado exitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error. No existe el paquete " + rpaquete.getText());
        }
    }

    private void crear() {
        Address dRemitente = new Address(calleEnvio.getText(), CiudadEnvio.getText(), EstadoEnvio.getText(), CodigoPostalEnvio.getText());
        Address dDestinatario = new Address(CalleDestino.getText(), CiudadDestino.getText(), EstadoDestino.getText(), CodigoPostalDestno.getText());
        Package p = new Package(dRemitente, dDestinatario, "AS00 " + ts.getnPackage() + 1, Integer.parseInt(Año.getText()), Integer.parseInt(Mes.getText()), Integer.parseInt(Dia.getText()));
        ts.addPackage(p);
        JOptionPane.showMessageDialog(null, "El paquete " + p.getTrackingNumber() + " se ha creado exitosamente");
    }


}
