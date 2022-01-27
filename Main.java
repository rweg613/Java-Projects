public class Main {
    public void speed(int speed) {
        if (speed > 275) {
            System.out.println("The car can't go that fast!");

        }
        else if (speed < 0) {
           throw new IllegalArgumentException("What!? The speed can't be negative!");

        }
        else {
            System.out.println("The car is going at "+speed+"mph");
        }
        }
    }
    

