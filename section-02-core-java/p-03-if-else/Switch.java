public class Switch {

    public static void main(String[] args) {
        int n = 2;

        // break is used to exit the switch statement
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;  
            case 4:
                System.out.println("Thursday");
                break;  
            case 5:
                System.out.println("Friday");
                break;  
            case 6:
                System.out.println("Saturday");
                break;  
            case 7:
                System.out.println("Sunday");
                break;          
            default:
                System.out.println("Enter a valid number");
                // do not use break here since this is the last case
                // break;
        }

    }
}