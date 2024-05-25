
public class CEO {
    private DepartamentosBuilder builder;

    public CEO(DepartamentosBuilder builder){
        this.builder = builder;
    }

    public void changeBuilder(DepartamentosBuilder builder){
        this.builder = builder;
    }

    public void makeEmployee(String type){
        switch (type){
            case "Departamento 1: ":
                builder.addEmpleados();
                builder.buildDepartment1();

                break;
            case "Departamento 2:":
                builder.addEmpleados();
                builder.buildDepartment2();
                break;
        }

}