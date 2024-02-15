public class App
{public static void main(String [] args)
{
    Student myStudent = new Student();
    myStudent.firstName = "Jim";
    myStudent.lastName = "Harris";
    myStudent.major = "Computer Information";
    myStudent.gpa = 2.4;
    myStudent.age = 25;
    myStudent.onProbation = false;

    Student myStudent2 = new Student();
    myStudent2.firstName = "Cooper";
    myStudent2.lastName = "Tom";
    myStudent2.major = "Ag";
    myStudent2.gpa = 3.1;
    myStudent2.age = 20;
    myStudent2.onProbation = false;

    System.out.println(myStudent2.onProbation);
}
}
