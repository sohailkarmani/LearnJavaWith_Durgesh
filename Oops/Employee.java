package Oops;

import java.util.Scanner;

public class Employee {
   private int empId; 
   
   public void setEmpId(int empId){
    this.empId=empId;
   }
   public int getEmpId(){
    return empId;
   }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Employee e1=new Employee();
    System.out.print("Enter employee ID :");
    int id=sc.nextInt();
    e1.setEmpId(id);
    System.out.println(e1.getEmpId());
    sc.close();
    
   }

}

