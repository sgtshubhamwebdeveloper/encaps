package ooppractices;

public class Employee { 
    
  static String Employee_name; 
  static float Employee_salary; 

  static void set(String n, float p) { 
      Employee_name  = n; 
      Employee_salary  = p; 
  } 
  static void get() { 
      System.out.println("Employee name is: " +Employee_name ); 
      System.out.println("Employee CTC is: " + Employee_salary); 
  } 
  public static void main(String args[]) { 
      Employee.set("Rukshdnya Bhagat", 900000); 
      Employee.get(); 
  } 
}  