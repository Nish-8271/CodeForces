public class EmployeeBean {
    private int  id;
    private String name;
    private double salary;

    public EmployeeBean(int id,String name,double salary) {
        this.id = id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
}
