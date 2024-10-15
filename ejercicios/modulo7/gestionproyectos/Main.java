package ejercicios.modulo7.gestionproyectos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        SistemaGestion sistemaGestion = new SistemaGestion();
        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    """
                    Menú de Gestión de Empleados:
                    1. Agregar Empleado
                    2. Listar Empleados
                    3. Eliminar Empleado
                    4. Modificar Empleado
                    5. Salir
                    Ingrese una opción:"""
            );

            switch (opcion) {
                case "1":
                    agregarEmpleado(sistemaGestion);
                    break;
                case "2":
                    sistemaGestion.listarEmpleados();
                    break;
                case "3":
                    eliminarEmpleado(sistemaGestion);
                    break;
                case "4":
                    modificarEmpleado(sistemaGestion);
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    private static void agregarEmpleado(SistemaGestion sistemaGestion) {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
            if (edad <= 0) {
                throw new IllegalArgumentException("La edad debe ser un número positivo");
            }

            RollEmpleado roll = RollEmpleado.valueOf(JOptionPane.showInputDialog("Ingrese el rol del empleado (DESARROLLADOR, TESTER, GERENTE, PROGRAMADOR):").toUpperCase());


            Empleado empleado = new Empleado(nombre, edad, roll);
            sistemaGestion.addEmpleado(empleado);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida");
        }
    }

    private static void eliminarEmpleado(SistemaGestion sistemaGestion) {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar:");
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            Empleado empleado = sistemaGestion.buscarEmpleado(nombre);
            if (empleado != null) {
                sistemaGestion.eliminarEmpleado(empleado);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida");
        }
    }

    private static void modificarEmpleado(SistemaGestion sistemaGestion) {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado a modificar:");
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            Empleado empleado = sistemaGestion.buscarEmpleado(nombre);
            if (empleado != null) {
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del empleado:");
                if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                    throw new IllegalArgumentException("El nuevo nombre no puede estar vacío");
                }

                int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del empleado:"));
                if (nuevaEdad <= 0) {
                    throw new IllegalArgumentException("La nueva edad debe ser un número positivo");
                }

                RollEmpleado nuevoRoll = RollEmpleado.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo rol del empleado (DESARROLLADOR, TESTER, GERENTE, PROGRAMADOR):").toUpperCase());
                sistemaGestion.modificarEmpleado(empleado, nuevoNombre, nuevaEdad, nuevoRoll);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida");
        }
    }
}