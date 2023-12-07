import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Library Management System !");
        Address address = new Address("Movarounnahr 1", "Tashkent","Tashkent","103022","Uzbekistan");
        Library library = new Library("NUU Library",address);
        Author author1 = new Author("Utkir Hoshimov","Utkir Hoshimov wrote Ikki eshik orasi");
        Author author2 = new Author("George Orwell","He wrote books about war 1984");
        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        BookItem bookItem1 = new BookItem("123234-234234","Title","OOP","Pearson","English",365, authorList,"233A",true,new Date("2023/12/7"), new Date("2023/12/11"),33000,BookFormat.PAPERBACK,BookStatus.AVAILABLE,new Date("2022/10/23"), new Date("2002/1/1"),new Rack(1,"1A"));
        System.out.println(bookItem1.toString());



    }
}