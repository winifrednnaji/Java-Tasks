import java.util.Scanner;
public class BackToSenderTask{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.outprint("Enter number of deliveries cpmpleted: ");
    int numberOfDeliveries = input.nextInt();
    
     System.out.print(int calc(int numberOfDeliveries));
    }


public static int calc(int numberOfDeliveries){
    int wage = 0;
    if (numberOfDeliveries < 50) wage = (numberOfDeliveries * 160) + 5000;
    else if (50 < numberOfDeliveries < 60 ) wage = (numberOfDeliveries * 200) + 5000;
    else if (60 < numberOfDeliveries < 70 ) wage = (numberOfDeliveries * 250) + 5000;
    else (numberOfDeliveries * 500) + 5000;
                 
    return wage;
                  
              }

            }
   
    

    
