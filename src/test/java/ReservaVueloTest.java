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
                "AC1234", "Victor", "AB1234567", 2, "2027-12-01"
        );
        assertEquals("Ingrese un código de reserva válido", resultado);
    }




}