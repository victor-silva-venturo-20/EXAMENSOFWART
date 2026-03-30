import java.time.LocalDate;

public class ReservaVuelo {
    public String registrarReserva(String codigoReserva, String nombrePasajero,
                                   String numeroPasaporte, int cantidadAsientos,
                                   String fechaVuelo) {

        if (codigoReserva == null || codigoReserva.isEmpty() ||
                nombrePasajero == null || nombrePasajero.isEmpty() ||
                numeroPasaporte == null || numeroPasaporte.isEmpty() ||
                fechaVuelo == null || fechaVuelo.isEmpty()) {
            return "Debe ingresar todos los datos requeridos";
        }
        if (!codigoReserva.matches("[A-Z]{3}[0-9]{3}")) {
            return "Ingrese un código de reserva válido";
        }
        if (!nombrePasajero.matches("[a-zA-Z]{5,}")) {
            return "El nombre del pasajero debe tener al menos cinco caracteres alfabéticos";
        }
        if (!numeroPasaporte.matches("[a-zA-Z0-9]{8,10}")) {
            return "Ingrese un número de pasaporte válido";
        }
        if (cantidadAsientos <= 0) {
            return "La cantidad de asientos debe ser mayor a cero";
        }
        LocalDate fecha = LocalDate.parse(fechaVuelo);
        if (!fecha.isAfter(LocalDate.now())) {
            return "La fecha del vuelo debe ser posterior a la fecha actual";
        }
        return "La reserva ha sido registrada correctamente";
    }
}
