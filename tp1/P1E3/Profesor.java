
package P1E3;

public class Profesor {
    private String nombre;
    private String apellido;
    private String email;
    private String catedra;
    private String facultad;
    
    public Profesor(String n, String a, String e, String c, String f){
        setNombre(n);
        setApellido(a);
        setEmail(e);
        setCatedra(c);
        setFacultad(f);
    }

    public String tusDatos(){
        return getNombre() + "|" + getApellido() + "|" + getEmail() + "|" + getCatedra() + "|" + getFacultad();
    }
    
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getCatedra() {
        return catedra;
    }

    private void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getFacultad() {
        return facultad;
    }

    private void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}
