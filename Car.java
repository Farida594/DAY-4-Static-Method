public class Car{
public void displayDetails(String showroomName, String modelName, int price){
System.out.println("showroom Name:"+showroomName);
System.out.println("car Model:"+modelName);
System.out.println("car Price:"+price);
}

public static void main(String[] args){
Car person =new Car();
person.displayDetails(" Elite Motors"," Tesla Motors", 80000);
person.displayDetails(" Elite Motors","BMW XS", 75000);
}
}



