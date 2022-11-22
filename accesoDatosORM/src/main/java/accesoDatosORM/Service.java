package accesoDatosORM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Service implements Consultas{

	//ATIBUTO que insertamos desde Consultas.
	@Autowired
	private Consultas consulta;
	
	//Implemantacion de los metodos.	
	public List<Empleado> selectAllEmpleados() {

		return consulta.selectAllEmpleados();
	}

	public Empleado selectEmpleadosID(int id) {

		return consulta.selectEmpleadosID(id);
	}

	public int insertEmpleados(Empleado empleado) {

		return consulta.insertEmpleados(empleado);
	}
	
	

}
