import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaVueloTest {

    private ReservaVuelo reservaVuelo;

    @BeforeEach
    void setUp() {
        reservaVuelo = new ReservaVuelo();
    }

    @Test
    @DisplayName("Test 1 - Código de reserva")
    void testCodigoReservaInvalido() {
        String resultado = reservaVuelo.registrarReserva(
                "AC1234", "Victor", "AB1234567", 2, "2026-03-20"
        );
        assertEquals("Ingrese un código de reserva válido", resultado);
    }

    @Test
    @DisplayName("Test 2 - Nombre con menos de 5 caracteres")
    void testNombrePasajeroInvalido() {
        String resultado = reservaVuelo.registrarReserva(
                "AB1234", "Ana", "AB1234567", 2, "2026-03-01"
        );
        assertEquals("El nombre del pasajero debe tener al menos cinco caracteres alfabéticos", resultado);
    }

    @Test
    @DisplayName("Test 3 - Número de pasaporte inválido")
    void testNumeroPasaporteInvalido() {
        String resultado = reservaVuelo.registrarReserva(
                "ABC123", "Carlos", "AB123", 2, "2026-03-03"
        );
        assertEquals("Ingrese un número de pasaporte válido", resultado);
    }

    @Test
    @DisplayName("Test 4 - Cantidad de asientos menor o igual a 0")
    void testCantidadAsientosInvalida() {
        String resultado = reservaVuelo.registrarReserva(
                "AB1234", "Victor", "AB1234567", 0, "2026-03-01"
        );
        assertEquals("La cantidad de asientos debe ser mayor a cero", resultado);
    }

    @Test
    @DisplayName("Test 5 - Fecha del vuelo anterior")
    void testFechaVueloInvalida() {
        String resultado = reservaVuelo.registrarReserva(
                "AB1234", "Victor", "AB1234567", 2, "2020-03-20"
        );
        assertEquals("La fecha del vuelo debe ser posterior a la fecha actual", resultado);
    }





}