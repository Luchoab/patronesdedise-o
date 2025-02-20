package Factory;

public class WhatsappNoti implements Notificaciones {

    @Override
    public void enviarMensaje() {
        System.out.println("Notificacion Whatsapp");
    }
}
