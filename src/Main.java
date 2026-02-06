public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 100);
        cuenta1.retirar(100);
        cuenta1.consignar(150);
        System.out.printf("El saldo de la cuenta es: " + cuenta1.getSaldo());

        Notificacion[] notificaciones = new Notificacion[2];
        notificaciones[0] = new NotificacionCorreo( receptorNotificacion: "Pepito");
        notificaciones[1] = new NotificacionCorreo( receptorNotificacion: "Juanito");

        notificaciones[0].enviarMensaje("Hola mi amigo");
        notificaciones[1].enviarMensaje("Hola amiga");

    }
}
