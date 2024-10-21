/*
API de Fechas y Horas (java.time)
    - Crea un programa que permita manejar citas de una agenda. Implementa funciones para:
    - Crear citas en fechas futuras.
    - Calcular el tiempo restante para la cita.
    - Cambiar el huso horario de las citas.
*/

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Agenda {
    // Método para crear una cita en el futuro
    public static LocalDateTime crearCita(int year, int month, int day, int hour, int minute) {
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    // Método para calcular el tiempo restante hasta una cita
    public static void calcularTiempoRestante(LocalDateTime cita) {
        LocalDateTime ahora = LocalDateTime.now();
        if (cita.isBefore(ahora)) {
            System.out.println("La cita ya ha pasado.");
        } else {
            Duration duracion = Duration.between(ahora, cita);
            long dias = duracion.toDays();
            long horas = duracion.toHours() % 24;
            long minutos = duracion.toMinutes() % 60;
            System.out.println("Tiempo restante para la cita: " + dias + " días, " + horas + " horas, y " + minutos + " minutos.");
        }
    }

    // Método para cambiar el huso horario de la cita
    public static ZonedDateTime cambiarHusoHorario(LocalDateTime cita, String zonaActual, String zonaNueva) {
        ZoneId zonaVieja = ZoneId.of(zonaActual);
        ZonedDateTime citaConZonaVieja = cita.atZone(zonaVieja);

        ZoneId nuevaZona = ZoneId.of(zonaNueva);
        ZonedDateTime citaConNuevaZona = citaConZonaVieja.withZoneSameInstant(nuevaZona);

        return citaConNuevaZona;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cita en una fecha futura
        System.out.println("Introduce los datos de la cita (año, mes, día, hora, minuto): ");
        System.out.print("Año: ");
        int year = scanner.nextInt();
        System.out.print("Mes: ");
        int month = scanner.nextInt();
        System.out.print("Día: ");
        int day = scanner.nextInt();
        System.out.print("Hora (24h): ");
        int hour = scanner.nextInt();
        System.out.print("Minuto: ");
        int minute = scanner.nextInt();

        LocalDateTime cita = crearCita(year, month, day, hour, minute);
        System.out.println("Cita creada para: " + cita.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

        // Calcular tiempo restante para la cita
        calcularTiempoRestante(cita);

        // Cambiar huso horario de la cita
        System.out.println("\nIntroduce la zona horaria actual de la cita (por ejemplo, America/New_York): ");
        String zonaActual = scanner.next();
        System.out.println("Introduce la nueva zona horaria para la cita (por ejemplo, Europe/Madrid): ");
        String nuevaZona = scanner.next();

        ZonedDateTime citaConNuevoHusoHorario = cambiarHusoHorario(cita, zonaActual, nuevaZona);
        System.out.println("Cita ajustada a la nueva zona horaria: " + citaConNuevoHusoHorario.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z")));

        scanner.close();
    }
}
