package SchoolManagement;

public class School {
    private TeacherList teachers=new TeacherList();
    private StudentList students=new StudentList();
    private double totalMoneyEarned=0;
    private double totalMoneySpent=0;

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void receiveFees(double fees) {
        totalMoneyEarned += fees;
    }

    public void paySalary(Teacher teacher) {
        totalMoneySpent += teacher.getSalary();
    }
}
