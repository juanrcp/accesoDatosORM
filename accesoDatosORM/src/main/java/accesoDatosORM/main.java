package accesoDatosORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		//Creamos context
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		//Creamos servicio con el context anterior y hacemos referencia al bean "service" que creamos en el bean.xml
		//ATENCION: Hay que realizar casting
		Service service = (Service) context.getBean("service");
		
		//Creamos objeto de la clase correspondiente a la tabla con la que queramos trabajar y le añadimos con el metodo correspondiente un nombre
		Empleado emp = new Empleado();		
		emp.setNombre_Empleado("Juan Ramon");
		
		//Hacemos insercion en la tabla con un int en el que añadimos nuestro service creado arriba y con el metodo insertEmpleado insertamos el objeto creado (INSERT)
		int insercion = service.insertEmpleados(emp);
		
		//Comprobamos insercion en tabla 
		System.out.println((insercion == 1) ? "Insercion de registro correcta." : "Error de insercion.");
		
		//Consulta de tabla por ID (SELECT)
		emp = service.selectEmpleadosID(1); //Llamamos al 
		String nombre = emp.getNombre_Empleado(); //Obtenemos el nombre del objeto
		System.out.println("Nombre: " + nombre);
		
		System.out.println();
		
		//Consulta y presentacion con una lista de todos los registros en la tabla
		List<Empleado> listaEmpleados = service.selectAllEmpleados();
		for (int i = 0; i < listaEmpleados.size(); i++) {
			System.out.println(i + ") " + (listaEmpleados.get(i)).getNombre_Empleado());
		}		
		
	}

}
