
public class Paciente {


	String codigo, nombre, apellidos, direccion, poblacion, provincia, codigoPostal, telefono, fNacimiento;
	
	public Paciente(String codigo,String nombre,String apellidos,String direccion,String poblacion,String privincia,String codigoPostal,String teléfono,String fNacimiento){
		this.codigo=codigo;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.poblacion=poblacion;
		this.provincia=provincia;
		this.codigoPostal=codigoPostal;
		this.telefono=telefono;
		this.fNacimiento=fNacimiento;
		
	}
	
	
	public void muestraPaciente(){
		
		System.out.println("Nombre del paciente: "+this.nombre);
		System.out.println("Apellidos del paciente: "+this.apellidos);
		System.out.println("Direccion del paciente: "+this.direccion);
		System.out.println("Población del paciente: "+this.poblacion);
		System.out.println("Provincia del paciente: "+this.provincia);
		System.out.println("Codigo Postal del paciente: "+this.codigoPostal);
		System.out.println("Teléfono del paciente: "+this.telefono);
		System.out.println("Fecha de nacimiento del paciente: "+this.fNacimiento);
		
		
	}
	
	


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getfNacimiento() {
		return fNacimiento;
	}


	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	
}
