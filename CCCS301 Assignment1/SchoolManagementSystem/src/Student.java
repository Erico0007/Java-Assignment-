public class Student extends Person implements Enrollable {


    // Member variables of this class
    private String major;
    private double gpa;


    public Student (String afirstName, String amiddleName, String alastName, int aage , String amajor, double agpa){

        super(afirstName,  amiddleName,  alastName,  aage);


 // This keyword refers top current instance
        this.major = amajor;
        this.gpa= agpa;


    }

   
  public String getmajor(){

 return this.major;

  }

  public double getgpa(){

    return this.gpa;
  }

@Override
  public  String toString (){

    return String.format( super.toString()+ " Major in : " +
     getmajor() + "\n" + " has a GPA of : " +
      getgpa() + "\n");
  }

  @Override
  public void Enroll (String course){

    System.out.println (super.toString() + "Enroll in "+ course);

  }

  @Override

  public void dropCourse( String course){

    System.out.println(super.toString() + "Dropped " + course);
  }



}
