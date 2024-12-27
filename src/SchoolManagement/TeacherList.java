package SchoolManagement;

public class TeacherList {
    private Teacher[] teachers=new Teacher[10];
    private int size=0;
    public void add(Teacher teacher){
        if (size>=teachers.length){
            Teacher[] newTeachers=new Teacher[teachers.length*2];
            for (int i = 0; i < teachers.length; i++) {
                newTeachers[i]=teachers[i];
            }
            teachers=newTeachers;
        }
        teachers[size++]=teacher;

    }
    public Teacher getTeacher(int index){
        return teachers[index];
    }
    public int getSize(){
        return size;
    }

}
