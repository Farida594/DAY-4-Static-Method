public class Faculty{
public void showFacultyDetails(String universityName, String facultyName, String department){
System.out.println("University Name:"+universityName);
System.out.println("Faculty Name:"+ facultyName);
System.out.println("Department:"+department);
}

public static void main(String[] args){
Faculty demo =new Faculty();
demo.showFacultyDetails("Stanford University","Dr. Robert Brown","Computer Science");
demo.showFacultyDetails("Stanford University","Lisa Green","physics");
}
}

