package SchoolManagement;

public class StudentList {
    private Student[] students =new Student[10];
    private int size=0;
    public void add(Student student){
        if (size>= students.length){
            Student[] newStudent=new Student[students.length*2];
            for (int i = 0; i < students.length; i++) {
                newStudent[i]= students[i];
            }
            students =newStudent;
        }
        students[size++]=student;

    }
    public Student getStudent(int index){
        return students[index];
    }
    public int getSize(){
        return size;
    }

}
