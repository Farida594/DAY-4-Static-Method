public class Enrollment{
public String getEnrollmentInfo(String platform, String course , String student){
return "Platform:"+platform +"\nCourse:"+course  +"\nStudent:"+student;
}

public static void main(String[] args){
Enrollment demo =new Enrollment();
System.out.println(demo. getEnrollmentInfo("Udemy","Java Progamming","Alice"));
System.out.println(demo. getEnrollmentInfo("Udemy","WebDevelopment","Bob"));
}
}


