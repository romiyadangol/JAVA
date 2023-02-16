import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("\n");
        System.out.println("a) What is the total number of employees?");
        System.out.print("-> ");
        int emp = input.nextInt();
        System.out.println("");

        System.out.println("b) What is the name of the supervisor?");
        System.out.print("-> ");
        input.nextLine();
        String sname = input.nextLine();
        System.out.println("");

        System.out.println("c) How many times the nuclear waste is removed from the core?");
        System.out.print("-> ");
        int wasteRem = input.nextInt();
        System.out.println("");

        // System.out.println("d) What is the total weight of waste produced every 1 week?");
        // System.out.print("-> ");
        // float weeklyWasteWt = input.nextFloat();
         float weeklyWasteWt = (float) wasteRem * 7;

        System.out.println("e) Is the Electric Motor being replaced every 18 days? Press \"y\" for yes and \"n\" for no.");
        System.out.print("-> ");
        char isReplaced = input.next().charAt(0);
        
        System.out.println("");
       
        System.out.println("f) What is the core average temperature (Celsius) of the Nuclear Reactor?");
        System.out.print("-> ");
        double coreTemp = input.nextFloat();
        double coreTempKelvin = coreTemp + 273.15;
        System.out.println("");
    

        System.out.println("\n");             
        System.out.println("****Update on Nuclear Reactor Status for JX00-XC-HB1 located in the East of Japan****:");
        System.out.println("Total number of employees: " + emp);
        System.out.println("Supervisor name: " + sname);
        System.out.println("Nuclear waste was removed from the core : " + wasteRem + " times ");
        System.out.println("Total weight of nuclear waste produced every 1 week: " + weeklyWasteWt );
        if(isReplaced == 'y')
        {
            System.out.println("Yes, The motor is being replaced");
        }
        else if(isReplaced == 'n')
        {
            System.out.println("No, The motor is not being replaced");
        }
        else
        {
            System.out.println("Invalid input!");
        }
        System.out.println("Core average temperature in Celsius: " + coreTemp + "°C");
        System.out.println("Core average temperature in Kelvin: " + coreTempKelvin + "K");
        System.out.println("\n\n");
    }
}
