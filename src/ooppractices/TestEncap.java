package ooppractices;

public class TestEncap {
    private String Name;
    private int Roll;
    private int Age;
    public int getAge() { 
    	return Age; 
    }
    public String getName() { 
    	return Name; 
    }
    public int getRoll() {
    	return Roll; 
    	}
    public void setAge(int newAge) {
    	Age = newAge; 
    	}
    public void setName(String newName)
    {
        Name = newName;
    }
    public void setRoll(int newRoll) {
    	Roll = newRoll; 
    	}
    public static void main(String[] args) {
        TestEncap obj = new TestEncap();
        obj.setName("Rukshdnya");
        obj.setAge(19);
        obj.setRoll(51);
        System.out.println("Name is: " + obj.getName());
        System.out.println("Age is: " + obj.getAge());
        System.out.println("Roll is : " + obj.getRoll());
 }
}