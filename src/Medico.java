

public class Medico {
String nombre, apellidos, especialidad;
int codigo, telefono;
	public Medico(String nombre, String apellidos, String especialidad, int codigo, int telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.especialidad=especialidad;
		this.codigo=codigo;
		this.telefono=telefono;
	}
	
	public void MuestraMedico() {
		System.out.println("Nombre : "+this.nombre);
		System.out.println("Apellido: "+this.apellidos);
		System.out.println("Especialidad: "+this.especialidad);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Telefono: "+this.telefono);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
