public class EmpleadoBuilder implements DepartamentosBuilder{

    private Empleado empleado;

    @java.lang.Override
    public void addEmpleados() {
        System.out.println("El empleado se esta agregando");
    }

    @java.lang.Override
    public void buildDepartment1() {
        System.out.println("Se esta agregando al departamento principal");

    }

    @java.lang.Override
    public void buildDepartment2() {
        System.out.println("Se esta agregando al Departamento Secundario");
    }
}
