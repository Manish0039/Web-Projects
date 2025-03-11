import java.util.Scanner;
public Class main {
    public static void main(String[] args) {
        double principle=0.0;
        double amount=0.0;
        int number=0;
        double time=0.0;
        double rate=0.0;
        double Compound_interest=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        principle = sc.nextDouble();

        System.out.println("Enter the time");
        time = sc.nextDouble();

        System.out.println("Enter the rate");
        rate = sc.nextDouble();

        System.out.println("Enter the No of compounding a year");
        number = sc.nextInt();

        amount = principle*Math.pow(1+(rate/number),time*number);

        Compound_interest= amount-principle;

        System.out.println("The compound interest is "+Compound_interest);

    
    }

}