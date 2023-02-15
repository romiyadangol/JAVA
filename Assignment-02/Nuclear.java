import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("\n");
        System.out.println("What is the total number of employees?");
        int emp = input.nextInt();

        System.out.println("What is the name of the supervisor?");
        String sname = input.next();

        System.out.println("How many times the nuclear waste is removed from the core?");
        int wasteRem = input.nextInt();

        System.out.println("What is the total weight of waste produced every 1 week?");
        float weeklyWasteWt = input.nextFloat();

        System.out.println("Is the Electric Motor being replaced every 18 days? Press \"y\" for yes and \"n\" for no.");
        char isReplaced = input.next().charAt(0);
       
        System.out.println("What is the core average temperature (Celsius) of the Nuclear Reactor?");
        double coreTemp = input.nextFloat();
        double coreTempKelvin = coreTemp + 273.15;

        System.out.println("\n");
        System.out.println("Update on Nuclear Reactor Status for JX00-XC-HB1 located in the East of Japan:");
        System.out.println("Total number of employees: " + emp);
        System.out.println("Supervisor name: " + sname);
        System.out.println("Nuclear waste was removed from the core : " + wasteRem + " times ");
        System.out.println("Total weight of nuclear waste produced every 1 week: " + weeklyWasteWt);
        System.out.println("Is the Electric Motor being replaced every 18 days? " + isReplaced);
        System.out.println("Core average temperature in Celsius: " + coreTemp + "°C");
        System.out.println("Core average temperature in Kelvin: " + coreTempKelvin + "K");
        System.out.println("\n\n");
    }
}
