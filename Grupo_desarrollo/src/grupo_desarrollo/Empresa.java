package grupo_desarrollo;

public class Empresa {


    // Atríbutos
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Nit;

    // Método constructor
    public Empresa(String nombre, String direccion, String telefono, String nit) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
        Nit = nit;
    }

    // Getter anb Setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }


}
