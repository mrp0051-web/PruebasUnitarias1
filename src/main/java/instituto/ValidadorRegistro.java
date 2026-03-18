package instituto;

public class ValidadorRegistro {
    public boolean validarNombre(String nombre) { return !nombre.isEmpty(); }
    public boolean validarPassword(String pass) { return pass.length() >= 8; }
    public boolean validarEmail(String email) { return email.contains("@"); }
    public boolean validarEdad(int edad) { return edad >= 16; }
}
