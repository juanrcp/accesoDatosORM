package accesoDatosORM;

//Clase para acceder a los datos de la tabla
public class Empleado {	
	
	//ATRIBUTOS de los campos de la tabla.
	private int id;
	private String nombre_Empleado;
	
	
	//METODOS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_Empleado() {
		return nombre_Empleado;
	}
	public void setNombre_Empleado(String nombre_Empleado) {
		this.nombre_Empleado = nombre_Empleado;
	}
	
	
	//CONSTRUCTORES
	public Empleado(int id, String nombre_Empleado) {
		super();
		this.id = id;
		this.nombre_Empleado = nombre_Empleado;
	}
	
	public Empleado() {}

}
