package agendaElectronica;

import agendaElectronica.igu.Principal;

public class AgendaElectronica {
    public static void main(String[] args) {
        
        Principal princ = new Principal(); //Creando un objecto
        princ.setVisible(true); //Que la ventana sea visible
        princ.setLocationRelativeTo(null); // Que la ventana aparezca en el centro
    }
}
