
package Factory;

public class EmailNoti implements Notificaciones {

    @Override
    public void enviarMensaje() {
        System.out.println("Notificacion Email");
    }
    
}
