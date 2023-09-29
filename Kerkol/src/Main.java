import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodN = null, drinkN = null, customerN, date, consent1, gender, comboN="", curDisc= "";
        char genderh = 0;
        int foodP = 1, drinkP = 1, fanddP, totalC = 0, custFee = 3000, comboP, foodS, drinkS, totalDisc = 0, totalDwF, total, totalSave = 0, pTax;
        double discount;
        double tax = 1.10;
        System.out.println("Please enter your name:");
        customerN = sc.nextLine();
        System.out.println("Enter the current date (DD/MM/YYYY)");
        date = sc.nextLine();
        System.out.println("Are you a male or a female  (Male/Female)");
        gender = sc.nextLine();
        if (gender.contains("ma")) {
            genderh = 'M';
        } else if (gender.contains("fe")) {
            genderh = 'F';
        } else {
            genderh = '?';
            System.out.println("You choose to hide your gender");
        }
        System.out.println("Welcome to our restaurant ! \nWe currently have a special combo going on right now would you like to order them ? (Yes/No)");
        consent1 = sc.next();
        if (consent1.endsWith("s")) {
            System.out.println("The combo that is current up are:");
            System.out.println("1. Chicken fried rice with tea (30000) \n2. Shrimp fried rice with tea (33000) \n3. Chicken katsu (with rice) with lemon tea (31000) \n4. Beef katsu (with rice) with lemon tea (46000) \n5. Goat fried rice with tea (39000)");
            comboP = sc.nextInt();
            switch (comboP) {
                case 1:
                    totalC = 30000;
                    comboN = "Chicken fried rice with tea";
                    break;
                case 2:
                    totalC = 33000;
                    comboN = "Shrimp fried rice with tea";
                    break;
                case 3:
                    totalC = 31000;
                    comboN = "Chicken katsu (with rice) with lemon tea";
                    break;
                case 4:
                    totalC = 46000;
                    comboN = "Beef katsu (with rice) with tea";
                    break;
                case 5:
                    totalC = 39000;
                    comboN = "Goat fried rice with lemon tea";
                    break;
                default:
                    comboN = "";
                    System.out.println("You didn't choose any combo");
            }
        } else if (consent1.endsWith("o")) {
            System.out.println("You choose to not see the special combo");
        }

    }
}