package secao08.exercicios01.ex03.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public void academicSituation(){
        if(finalGrade() >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", (60 - finalGrade()));
        }
    }
}
