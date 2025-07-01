package prototype.soyeon;

class Employee implements Cloneable {
    private int employeeId;
    private String name;
    private String position;
    private Department department;

//    Shallow Copy
//    @Override
//    public Employee clone() throws CloneNotSupportedException {
//        return (Employee) super.clone();
//    }

//    Deep Copy
    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.department = new Department(this.department.getDepartmentId(),
                this.department.getDepartmentName(),
                this.department.getLocation());

        return employee;
    }

    public Employee(int employeeId, String name, String position, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}