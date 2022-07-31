import java.util.Scanner;


public class main {     

    public static void main(String[] args) {
    	 int userInput;

         //new fan
    	 fan fan = new fan();

         System.out.println("Please choose one from the two pull cords: " );
         System.out.println("1. Increases the fan speed" + "\n" + "2. Reverses the fan direction" );
         Scanner reader = new Scanner (System.in);
         
         while (true) {
        	 try { 
        	 int input = reader.nextInt();
        	 
             if (input == 1) {
            	 int speed = fan.getSpeed();
                 if (speed == 2) {
                     speed = 0;
                     System.out.println("The fan's speed return to off.");
                 }else {
                     speed++;
                     System.out.println("The fan's speed increases.");
                 }
                 fan.setSpeed(speed);
                 System.out.printf("The fan's current speed is %d and its direction is %s \n",fan.getSpeed(),fan.getDirection());
             }else if (input == 2) {
            	 System.out.println("pull 2");
            	 String direction = fan.getDirection();
            	 System.out.println("Reversed the fan's direction.");
            	 if (direction == "Forward") {
            		 direction = "Backward";
            	 }else {
            		 direction = "Forward";
            	 }
            	 fan.setDirection(direction);
            	 System.out.printf("The fan's current speed is %d and its direction is %s \n",fan.getSpeed(),fan.getDirection());
             }else {
            	 System.out.println("Not a valid pull cord, please choose again.");
             }
        	 }catch (Exception e) { 
        		 System.out.println("Invalid input type (must be an integer), please try again.");
                 reader.nextLine();
        	 }
         }
         
    }
}