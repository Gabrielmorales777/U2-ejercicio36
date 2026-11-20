
public class AuthGitHub extends ProveedorIdentidad {

    public AuthGitHub() {
        super("GitHub");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (!validarTokenInicial(tokenAcceso)) {
            return false;
        }

        System.out.println("Verificando token con GitHub...");

        return tokenAcceso.startsWith("GTH-");
    }
}
