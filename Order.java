public class Order{
public String getOrderDetail(String restaurentName, String foodItem, int quantity){
return "Restaurent Name:"+restaurentName +"\nFood Item:" +foodItem +"\nQuantity:"+quantity;
}

public static void main(String[] args){
Order demo =new Order();
System.out.println(demo.getOrderDetail("Spice Garden","Paneer Butter Masala",2));
System.out.println (demo.getOrderDetail("Spice Garden","Chicken Biryani",1));
}
}

