public class Patient{
public void printDetails(String hospitalName, String patientName, int age){
System.out.println("Hospital Name:"+hospitalName);
System.out.println("Patient Brand:"+ patientName);
System.out.println("Patient Age:"+age);
}

public static void main(String[] args){
Patient person =new Patient();
person.printDetails("City Care Hospital","John Doe",45);
person.printDetails("City Care Hospital","Emma Watson",30);
}
}

