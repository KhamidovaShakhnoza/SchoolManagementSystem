package SchoolManagement;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double salaryEarned;


    public Teacher(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return firstName + " " + lastName;
    }


    public double getSalaryEarned() {
        return salaryEarned;
    }
    public void receiveSalary(){

        salaryEarned+=salary;
        System.out.println("Salary paid to "+getName()+":$"+salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary + '}';
    }
}
