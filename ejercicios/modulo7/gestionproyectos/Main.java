package ejercicios.modulo7.gestionproyectos;

public class Main {
    public static void main(String[] args) {
        SistemaGestion sistemaGestion = new SistemaGestion();
        Empleado empleado1 = new Empleado("Juan", 25, RollEmpleado.PROGRAMADOR);
        Empleado empleado2 = new Empleado("Pedro", 30, RollEmpleado.PROGRAMADOR);
        Empleado empleado3 = new Empleado("Maria", 35, RollEmpleado.TESTER);
        Empleado empleado4 = new Empleado("Ana", 40, RollEmpleado.GERENTE);
        Empleado empleado5 = new Empleado("Luis", 45, RollEmpleado.DESARROLLADOR);

        sistemaGestion.addEmpleado(empleado1);
        sistemaGestion.addEmpleado(empleado2);
        sistemaGestion.addEmpleado(empleado3);
        sistemaGestion.addEmpleado(empleado4);
        sistemaGestion.addEmpleado(empleado5);

        sistemaGestion.listarEmpleados();

        sistemaGestion.eliminarEmpleado(empleado2);

        sistemaGestion.listarEmpleados();

        sistemaGestion.modificarEmpleado(empleado1, "Juan Perez", 26, RollEmpleado.PROGRAMADOR);

        sistemaGestion.listarEmpleados();
    }
}
