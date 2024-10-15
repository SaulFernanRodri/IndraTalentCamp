package ejercicios.modulo7.gestionproyectos;

import java.util.ArrayList;

public class SistemaGestion {
    private final ArrayList<Empleado> empleados;

    public SistemaGestion(){
        empleados = new ArrayList<>();
    }

    @Operacion(nombre = "Agregar Empleados")
    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    @Operacion(nombre = "Listar Empleados")
    public void listarEmpleados(){
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    @Operacion(nombre = "Eliminar Empleado")
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }

    @Operacion(nombre = "Modificar Empleado")
    public void modificarEmpleado(Empleado empleado, String nombre, int edad, RollEmpleado roll){
        empleado.setNombre(nombre);
        empleado.setEdad(edad);
        empleado.setRoll(roll);
    }

    @Operacion(nombre = "Buscar Empleado por nombre")
    public Empleado buscarEmpleado(String nombre){
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                System.out.println(empleado);
                return empleado;
            }
        }
        return null;
    }

}
