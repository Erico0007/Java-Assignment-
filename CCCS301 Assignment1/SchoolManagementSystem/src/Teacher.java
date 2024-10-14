public class Teacher extends Person {

    // Member variables of this class

    private String subject;
    private String qualification;


    public Teacher( String afirstName, String amiddleName, String alastName, int aage , String asubject , String aqualification ) {

        super(afirstName,  amiddleName,  alastName,  aage);

        // This keyword refers top current instance

        this.subject = asubject;
        this.qualification = aqualification;
    }


    public String  getsubject(){

        return this.subject;
    }

    public String getqualification(){

        return this.qualification;
    }


@Override
    public String toString(){

     return String.format ( super.toString() + " is teaching  in "
      + getsubject() + "\n" + " has a diploma in " 
      + qualification + "\n" );

    }

    public void teachCourse(String course){

        System.out.println( " first name " + getfirstName()+ " : \n " + " Last name is : " +  getlastName() + "  \n" + "Teaching in : "  +   course + "\n");
    }

}
