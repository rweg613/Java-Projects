import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How fast are you going? ");
        int speed = myObj.nextInt();
        Main myObj1 = new Main();
        myObj1.speed(speed);

    }    


    
}