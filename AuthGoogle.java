
public class AuthGoogle extends ProveedorIdentidad {

    public AuthGoogle() {
        super("Google");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenInicial(tokenAcceso)) {
            return false;
        }

        System.out.println("Verificando token con Google...");

        // Simulacion de validacion
        return tokenAcceso.startsWith("GGL-");
    }
}
