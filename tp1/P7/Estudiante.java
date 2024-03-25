package e7;
public class Estudiante {
	private String nombre;
	private String apellido;
	
	public Estudiante(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
}
