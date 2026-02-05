import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("💱 Currency Converter");
        System.out.println("Available Currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");

        System.out.print("Choose base currency (1-3): ");
        int base = sc.nextInt();

        System.out.print("Choose target currency (1-3): ");
        int target = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double rate = getExchangeRate(base, target);
        double convertedAmount = amount * rate;

        System.out.println("✅ Converted Amount: " + convertedAmount);

        sc.close();
    }

    
    static double getExchangeRate(int base, int target) {

        
        double inrToUsd = 0.012;
        double inrToEur = 0.011;

        if (base == target)
            return 1;

        
        if (base == 1 && target == 2) return inrToUsd;
        if (base == 1 && target == 3) return inrToEur;

        
        if (base == 2 && target == 1) return 1 / inrToUsd;
        if (base == 2 && target == 3) return inrToUsd / inrToEur;

        // EUR conversions
        if (base == 3 && target == 1) return 1 / inrToEur;
        if (base == 3 && target == 2) return inrToEur / inrToUsd;

        return 1;
    }
}
