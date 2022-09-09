import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }

    public void greet(){
        Scanner sc = new Scanner(System.in);
        String navn = sc.next();
    }
    public void stoopidMethod(){
        System.out.println("This method is stupid");
    }
    public void dumMethod(){
        System.out.println("a very dum method");
    }
}
