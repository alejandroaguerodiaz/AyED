package P1E3;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String comision;
    private String email;
    private String direccion;
    
    public Estudiante(String n, String a, String c, String e, String dir){
        setNombre(n);
        setApellido(a);
        setComision(c);
        setEmail(e);
        setDireccion(dir);
    }
    
    public String tusDatos(){
        return getNombre() + "|" + getApellido() + "|" + getComision() + "|" + getEmail() + "|" + getDireccion();
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private void setComision(String comision) {
        this.comision = comision;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getComision() {
        return comision;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
