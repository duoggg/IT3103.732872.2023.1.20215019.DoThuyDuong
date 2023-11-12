/* 
	        Ex    : Day of a month
	        author : Do Thuy Duong 20215019
	        ClassID: 732872 
	    */
	package hust.soict.dsai.lab01;
	
    import java.util.Scanner;

    public class DayofMonth {
        public static void main(String[] args) {

            String[] month2 = {"February", "Feb.", "Feb", "2"};

            // Month has 31 days
            String[] month31 = {"January", "Jan.", "Jan", "1",
                                "March", "Mar.", "Mar", "3",
                                "May", "5",
                                "July", "Jul.", "7",
                             "August", "Aug.", "Aug", "8",
                             "October", "Oct.", "Oct", "10",
                             "December", "Dec.", "Dec", "12"
                            };
        
            // Month has 30 days
            String[] month30 = {"April", "Apr.", "Apr", "4",
                            "June", "Jun", "6",
                            "September", "Sept.", "Sep", "9",
                            "November", "Nov.", "Nov", "11"};

            int year;
            String month;

            // Input year
            System.out.print("Year : ");
            Scanner yearInput = new Scanner(System.in);
            year = yearInput.nextInt();
            if(year <= 0){
                System.out.print("Wrong input!");
                System.exit(0);
            }
               
            // Input month
            System.out.print("Month : ");
            Scanner monthInput = new Scanner(System.in);
            month = monthInput.nextLine();
            
            //Check if 31 days
            for(String i : month31) {
                if(i.equals(month)) {
                    System.out.println( "The days of month: 31");
                    System.exit(0);
                }
            }

            // Check if 30 dayss
            for(String i : month30) {
                if(i.equals(month)) {
                    System.out.println( "The days of month: 30");
                    System.exit(0);
                }
            }

            //Check if Feb
            for(String i : month2) {
                if(i.equals(month)) {
                    if(year % 4 == 0 ) {

            // Not leap year
                        if(year % 100 == 0 && year % 400 != 0){
                            System.out.println("The day of month: 28");
                            System.exit(0);
                        }

            // Leap year
                        else {
                            System.out.println("The day of month: 29");
                            System.exit(0);
                        }    
                    }

            // Not leap year
                    else {
                        System.out.println("The day of month: 28");
                        System.exit(0);
                    }
                }
            }
            System.out.println("Wrong input!\n");
        
    }
}