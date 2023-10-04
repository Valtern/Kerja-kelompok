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
        System.out.println("Here is our food menu. Please order a food");
        System.out.println("1. Chicken friend rice (27000) \n2. Shrimp fried rice (28000) \n3. Chicken katsu with rice (26000) \n4. Goat fried rice (30000) \n5. Beef katsu with rice (35000) \n6. Fried onion rings (12000) \n7. Fried mushroom (14000) \n8. Friend chicken skin (16000) ");
        foodS = sc.nextInt();
        switch (foodS) {
            case 1:
                foodP = 27000;
                foodN = "Chiken fried rice";
                break;
            case 2:
                foodP = 28000;
                foodN = "Shrimp fried rice";
                break;
            case 3:
                foodP = 26000;
                foodN = "Chicken katsu with rice";
                break;
            case 4:
                foodP = 30000;
                foodN = "Goat fried rice";
            case 5:
                foodP = 35000;
                foodN = "Beef katsu with rice";
                break;
            case 6:
                foodP = 12000;
                foodN = "Fried onion ring";
                break;
            case 7:
                foodP = 14000;
                foodN = "Fried mushroom";
                break;
            case 8:
                foodP = 16000;
                foodN = "Friend chicken skin";
                break;
            default:
                foodP = 0;
                foodN = "";
                System.out.println("You did not choose any food");
        }
        System.out.println("Here is our beverage menu. Please order a beverage");
        System.out.println("1. Ice tea (6000)\n2. Lemon tea (8000) \n3. Mineral water (3000) \n4. Orange juices (11000) \n5. Suspicious drink (99999)");
        drinkS = sc.nextInt();
        switch (drinkS) {
            case 1:
                drinkP = 6000;
                drinkN = "Ice tea";
                break;
            case 2:
                drinkP = 8000;
                drinkN = "Lemon tea";
                break;
            case 3:
                drinkP = 3000;
                drinkN = "Mineral water";
                break;
            case 4:
                drinkP = 11000;
                drinkN = "Orange juice";
                break;
            case 5:
                drinkP = 99999;
                drinkN = "Suspicious drink";
                break;
            default:
                drinkP = 0;
                drinkN = "";
                System.out.println("You did not choose any drink");
        }
        fanddP = drinkP + foodP + totalC;
        if (fanddP >= 50000 && fanddP <= 99999) {
            totalDisc = fanddP;
            totalDisc = (int) (fanddP * 0.90);
            totalSave = (int) (fanddP * 0.10);
            curDisc = "You got a 10% discount";
        } else if (fanddP >= 100000) {
            totalDisc = fanddP;
            totalDisc = (int) (fanddP * 0.85);
            totalSave = (int) (fanddP * 0.15);
            curDisc = "You got a 15% discount";
        } else {
            totalDisc = fanddP + totalDisc;
            System.out.println("You didn't get any special discount");
        }
        totalDwF = totalDisc + custFee;
        total = (int) (totalDwF * tax);
        pTax = (int) (totalDwF * 0.10);
        System.out.println("Your receipt:");
        System.out.println(customerN + "\n" + date + "\n" + "Gender: " + genderh);
        System.out.println(comboN + "\n" + foodN + "\n" + drinkN + "\n");
        System.out.println(curDisc + "\n");
        System.out.println("Original price: " + fanddP + "\n" + "Original discount price: "+ totalDisc + "\nYou saved a total of: " + totalSave +"\nCustomer fee: 3000"+ "\n" + "Tax (10%): " + pTax);
        System.out.println("Total: " + total);
    }
}
