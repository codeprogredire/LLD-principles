package Lesson1;

public class Employee{
    private int id;

    public int getId(){
        return this.id;
    }

    public String fetchBioData(){
        return "some biodata";
    }

    public double calculateSalary(){
        return 0;
    }

    public void printPerformanceData(){
        System.out.println("Some performance related data");
    }


}