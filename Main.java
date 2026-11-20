
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ProveedorIdentidad> proveedores = new ArrayList<>();

        proveedores.add(new AuthGoogle());
        proveedores.add(new AuthGitHub());
        proveedores.add(new AuthApple());

        String[] tokens = {
                "GGL-12345",
                "GTH-67890",
                "APL-54321"
        };

        System.out.println("=== SISTEMA DE AUTENTICACION ===");

        for (int i = 0; i < proveedores.size(); i++) {

            ProveedorIdentidad proveedor = proveedores.get(i);

            boolean acceso = proveedor.validarToken(tokens[i]);

            System.out.println(
                    "Proveedor: " + proveedor.nombreProveedor
            );

            if (acceso) {
                System.out.println("Estado: Acceso autorizado.");
            } else {
                System.out.println("Estado: Acceso denegado.");
            }

            System.out.println("--------------------------");
        }
    }
}
