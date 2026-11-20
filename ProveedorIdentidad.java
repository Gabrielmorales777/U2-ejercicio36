
public abstract class ProveedorIdentidad {

    protected String nombreProveedor;

    public ProveedorIdentidad(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public abstract boolean validarToken(String tokenAcceso);

    protected boolean validarTokenInicial(String tokenAcceso) {

        if (tokenAcceso == null || tokenAcceso.trim().isEmpty()) {
            System.out.println("Error: el token no puede estar vacio.");
            return false;
        }

        return true;
    }
}
