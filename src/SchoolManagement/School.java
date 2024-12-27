package SchoolManagement;

public class School {
    private Teacher[] teachers=new Teacher[2];
    private Student[] students= new Student[2];
    private int teacherCount=0;
    private int studentCount=0;
    private double totalMoneyEarned=0;
    private double totalMoneySpent=0;

    public void addTeacher(Teacher teacher) {

        if(teacherCount>=teachers.length) {
            Teacher[] newTeachers=new Teacher[teachers.length*2];
            for (int i = 0; i < teachers.length; i++) {
                newTeachers[i]=teachers[i];
            }
            teachers=newTeachers;
        }
            teachers[teacherCount++] = teacher;

    }

    public void addStudent(Student student) {

            if (studentCount>=students.length) {
                Student[] newStudents=new Student[students.length*2];
                for (int i = 0; i < students.length; i++) {
                    newStudents[i]=students[i];
                }
            }
        students[studentCount++] = student;

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
