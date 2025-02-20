package Factory;

public class NotificacionesFactory {
    public Notificaciones crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("Email")) {
            return new EmailNoti();
        } else if (tipo.equalsIgnoreCase("Whatsapp")) {
            return new WhatsappNoti();
        } else {
            throw new IllegalArgumentException("Tipo de notificación no válido: " + tipo);
        }
    }
}
