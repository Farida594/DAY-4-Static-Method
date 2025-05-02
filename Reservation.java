public class Reservation{
public String getReservationDetails(String hotelname, String questName, int nights){
return "Hotel Name:"+ hotelname+"\nGuest Name:"+questName +"\nNights:"+nights;
}

public static void main(String[] args){
Reservation demo =new Reservation();
System.out.println(demo.getReservationDetails("Grand Palace","David",3));
System.out.println(demo.getReservationDetails("Grand Palace","Maria",2));
}
}

