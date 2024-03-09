package Lesson1.Example2Java.BetterCode.Employee;

//this codde is only responsible for Employee entity management

public class Employee{
    private final int employeeId;

    public Employee(int id){
        this.employeeId=id;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }
}
