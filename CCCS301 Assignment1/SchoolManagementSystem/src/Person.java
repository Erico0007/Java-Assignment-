public abstract class Person {

    // data Members (Instance variables)
private String firstName;
private String middleName;
private String lastName;
private int  age;


// constructor with parameters.

public Person ( String afirstName, String amiddleName, String alastName, int aage) {

 this.firstName = afirstName;
 this.middleName = amiddleName;
 this.lastName = alastName;
 this.age = aage;



}// return the first name
public String getfirstName(){

    return this.firstName;
}
// return the middle name 
public String getmiddleName(){

    return this.middleName;

}
// return the last name
public String getlastName(){

    return this.lastName;
}
// return the Age. 
public int getage(){

    return this.age;
}
    // return string representation of  Person. 
@Override
public String toString(){
    return  String.format( " first Name is : "  + getfirstName() + "\n" + " Middle Name :  " + getmiddleName() + " \n" + " Last Name : " + getlastName()+ "\n" + "Age : " + getage() + "\n");

}

}
