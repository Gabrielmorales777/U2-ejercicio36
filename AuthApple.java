
public class AuthApple extends ProveedorIdentidad {

    public AuthApple() {
        super("Apple");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenInicial(tokenAcceso)) {
            return false;
        }

        System.out.println("Verificando token con Apple...");

        return tokenAcceso.startsWith("APL-");
    }
}
