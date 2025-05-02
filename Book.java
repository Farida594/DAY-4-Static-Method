public class Book{
public void displayInfo(String libraryName, String title, String author){
System.out.println("library Name:"+libraryName);
System.out.println("Book Title:"+title);
System.out.println("Book Author:"+author);
}

public static void main(String[] args){
Book person =new Book();
person.displayInfo("City Public Library","The Great Gatsby","F.Scott Fitzgerald");
person.displayInfo("City Public Library","1984","George Orwell");
}
}


