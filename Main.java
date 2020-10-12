import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
      student1.setName("Arnold Spielberg");
       student1.setGPA(4.0);
      student1.setMajor("Electrical Engineering");

     Student student2 = new Student();
       student2.setName("Damon Nicholas");
      student2.setGPA(4.3);
      student2.setMajor("Information Systems");


    student1.print();
    student2.print(); 

  

 ArrayList<Double> gradepointaverage = new ArrayList<Double>();
      gradepointaverage.add(student1.gpa);
      gradepointaverage.add(student2.gpa);
      double sum = 0;


 
      for ( int i=0; i < gradepointaverage.size(); i++){
        sum += gradepointaverage.get(i);
      } 
      System.out.println("The average GPA is " + sum / gradepointaverage.size());

}

}


 //gradepointaverage.add(4.0);
      //gradepointaverage.add(4.3);