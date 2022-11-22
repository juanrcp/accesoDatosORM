package accesoDatosORM;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//En esta interfaz declararemos los metodos para las acciones sobre la base de datos. 
public interface Consultas {
	
	//Etiqueta mybatis que nos permite incluir una query para hacer la consulta de todo lo que tiene la tabla
	@Select("SELECT * FROM empleados")
	public List<Empleado> selectAllEmpleados();
	
	//Etiqueta mybatis que nos permite incluir una query para hacer la consulta de un empleado concreto
	@Select("SELECT * FROM empleados WHERE \"Id\" = #{id}")
	public Empleado selectEmpleadosID(@Param("id")int id); //Con esta etiqueta seleccionamos el parametro que queremos
	
	//Etiqueta mybatis que nos permite incluir una query para hacer la insercion (ID autoincremental)
	@Insert("INSERT INTO empleados (\"nombre_empleado\") VALUES (#{nombre_Empleado})")
	public int insertEmpleados(Empleado empleado);
	

}
