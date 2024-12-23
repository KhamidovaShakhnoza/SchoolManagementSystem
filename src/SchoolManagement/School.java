package SchoolManagement;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    private int teacherCount;
    private int studentCount;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    public School() {
        teachers = new Teacher[100];
        students = new Student[100];
        teacherCount = 0;
        studentCount = 0;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount++] = teacher;
        }
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
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
        teacher.receiveSalary();
    }
}
