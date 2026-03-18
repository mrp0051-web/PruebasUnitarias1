package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorResgistroTest
{
    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    // --- RETO 1: Nombre vacío ---
    @Test
    @DisplayName("Reto 1: Un nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");
        // Esperamos FALSE porque un nombre vacío no es válido
        assertFalse(resultado, "Error: El sistema permitió un nombre vacío");
    }

    // --- RETO 2: Password justa ---
    @Test
    @DisplayName("Reto 2: Una contraseña de exactamente 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");
        // Esperamos TRUE porque el límite suele ser a partir de 8
        assertTrue(resultado, "Error: El sistema rechazó una contraseña de 8 caracteres");
    }

    // --- RETO 3: Password corta ---
    @Test
    @DisplayName("Reto 3: Una contraseña de 5 caracteres debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");
        // Esperamos FALSE porque es demasiado corta
        assertFalse(resultado, "Error: El sistema permitió una contraseña de solo 5 caracteres");
    }

    // --- RETO 4: Email sin arroba ---
    @Test
    @DisplayName("Reto 4: Un email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        // Esperamos FALSE porque le falta el formato de email (@)
        assertFalse(resultado, "Error: El sistema aceptó un email sin el símbolo @");
    }

    // --- RETO 5: Edad límite (16 años) ---
    @Test
    @DisplayName("Reto 5: Un usuario de exactamente 16 años debe ser aceptado")
    public void testEdadLimite() {
        boolean resultado = validador.validarEdad(16);
        // Esperamos TRUE porque 16 es la edad mínima legal establecida
        assertTrue(resultado, "Error: El sistema rechazó a un usuario con la edad mínima (16)");
    }
}


