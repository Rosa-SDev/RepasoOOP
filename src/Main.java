public class Main {

    public static void main(String[] args) {

        Notificacion[] notificaciones = new Notificacion[5];

        notificaciones[0] = new NotificacionCorreo("Pepito");
        notificaciones[1] = new NotificacionSMS("Juanito");

        notificaciones[0].enviarMensaje("Hola mi amigo");
        notificaciones[1].enviarMensaje("Hola mi broco");
    }
}

