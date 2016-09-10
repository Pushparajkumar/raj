
import java.util.Scanner;
public class name1 {
    public static void main(String[] args) {
        //char[] name=new char[20];
        String title,name;
        Scanner sc=new Scanner(System.in);
                title=sc.nextLine();
        name=sc.next();
        char[] ch=name.toCharArray();
      
        System.out.println(title+","+ch[0]);
    }
}
