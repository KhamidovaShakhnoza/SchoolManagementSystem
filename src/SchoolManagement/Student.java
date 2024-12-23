package SchoolManagement;

public class Student {
     private int id;
     private String firstName;
     private String lastName ;
     private int grade;
     private double feesPaid;
     private double feesTotal;
    public Student(int id,String firstName,String lastName,int grade,double feesTotal) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=feesTotal;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return firstName+" "+lastName;
    }

    public int getGrade() {

        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public  double getFeesTotal() {

        return feesTotal;
    }
    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }
    public void pay(double fees) {
        if (fees <= (feesTotal - feesPaid)) {
            feesPaid += fees;
            System.out.println(getName() + " paid fees: $" + fees);
        } else {
            System.out.println("Payment exceeds remaining fees for " + getName());
        }
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id +
               ", name='"+getName()+"',grade=" + grade +
                ", feesTotal=" + feesTotal + '}';
    }
}
