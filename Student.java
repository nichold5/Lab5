import java.util.ArrayList;

class Student {
    String name;
    double gpa;
    String major;

     String getName() {
       return name;
     }

   double getGPA() {
     return gpa;
   }

   String getMajor() {
     return major;
   }

    void setName(String theName) {
      name = theName; 
    }

    void setGPA(double theGPA) {
      gpa = theGPA;
    }

     void setMajor(String theMajor) {
        major = theMajor;
     }




     //print outputs
  void print() {
      System.out.println("The student's name is " + name);
      System.out.println("The student's GPA is " + gpa);
      System.out.println("The student's major is " + major);
    
  
    }






}