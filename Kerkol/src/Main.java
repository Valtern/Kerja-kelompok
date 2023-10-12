import java.util.Scanner;

class proyek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerN = "", date = "", gender, takeOrDine, eatconcl = "", confirm = "";
        char genderh = 0;
        int totalC = 0, custFee = 3000, totalDisc = 0, pTax, restauFee = 0;
        double tax = 1.10;
        boolean consent2 = true;

        System.out.println("Take away or dine in?");
        takeOrDine = sc.nextLine();
        if (takeOrDine.endsWith("ake")) {
            restauFee = 4000;
            eatconcl = "Take away";
            System.out.println("Take away order");
        } else if (takeOrDine.endsWith("ine")) {
            System.out.println("Dine in order");
            eatconcl = "Dine in";
        }
        while (consent2) {
            System.out.println("Please enter your name:");
            customerN = sc.nextLine();

            System.out.println("Enter the current date (DD/MM/YYYY)");
            date = sc.nextLine();

            System.out.println("Are you a male or a female  (Male/Female)");
            gender = sc.nextLine();
            if (gender.equalsIgnoreCase("male")) {
                genderh = 'M';
            } else if (gender.equalsIgnoreCase("female")) {
                genderh = 'F';
            } else {
                genderh = '?';
                System.out.println("You choose to hide your gender");
            }
            System.out.println(customerN + "\n" + date + "\n" + genderh);
            System.out.println("Is this the correct information ? (Yes/No)");
            confirm = sc.nextLine();
            if (confirm.endsWith("es")) {
                consent2 = false;
            } else {
                continue;
            }

        }
        System.out.println("Welcome to our restaurant ! \nWe currently have a special combo going on right now would you like to order them ? (Yes/No)");
        String consent1 = sc.next();
        String comboN = "";
        int comboP = 0;

        if (consent1.equalsIgnoreCase("yes")) {
            System.out.println("The combo that is currently up are:");
            System.out.println("1. Chicken fried rice with tea (30000) \n2. Shrimp fried rice with tea (33000) \n3. Chicken katsu (with rice) with lemon tea (31000) \n4. Beef katsu (with rice) with lemon tea (46000) \n5. Goat fried rice with tea (39000)");

            while (true) {
                System.out.print("Enter the combo number (Type 0 to finish): ");
                comboP = sc.nextInt();
                if (comboP == 0) {
                    break;
                }
                switch (comboP) {
                    case 1:
                        totalC += 30000;
                        comboN += "Chicken fried rice with tea\n";
                        break;
                    case 2:
                        totalC += 33000;
                        comboN += "Shrimp fried rice with tea\n";
                        break;
                    case 3:
                        totalC += 31000;
                        comboN += "Chicken katsu (with rice) with lemon tea\n";
                        break;
                    case 4:
                        totalC += 46000;
                        comboN += "Beef katsu (with rice) with tea\n";
                        break;
                    case 5:
                        totalC += 39000;
                        comboN += "Goat fried rice with lemon tea\n";
                        break;
                    default:
                        System.out.println("Invalid combo number");
                }
            }
        } else {
            System.out.println("You choose not to see the special combo");
        }

        String foodN = "";
        int foodP = 0;
        int foodS;

        System.out.println("Here is our food menu. Please order a food");
        System.out.println("1. Chicken fried rice (27000) \n2. Shrimp fried rice (28000) \n3. Chicken katsu with rice (26000) \n4. Goat fried rice (30000) \n5. Beef katsu with rice (35000) \n6. Fried onion rings (12000) \n7. Fried mushroom (14000) \n8. Fried chicken skin (16000)");

        while (true) {
            System.out.print("Enter the food number (Type 0 to finish): ");
            foodS = sc.nextInt();
            if (foodS == 0) {
                break;
            }
            switch (foodS) {
                case 1:
                    foodP += 27000;
                    foodN += "Chicken fried rice\n";
                    break;
                case 2:
                    foodP += 28000;
                    foodN += "Shrimp fried rice\n";
                    break;
                case 3:
                    foodP += 26000;
                    foodN += "Chicken katsu with rice\n";
                    break;
                case 4:
                    foodP += 30000;
                    foodN += "Goat fried rice\n";
                    break;
                case 5:
                    foodP += 35000;
                    foodN += "Beef katsu with rice\n";
                    break;
                case 6:
                    foodP += 12000;
                    foodN += "Fried onion rings\n";
                    break;
                case 7:
                    foodP += 14000;
                    foodN += "Fried mushroom\n";
                    break;
                case 8:
                    foodP += 16000;
                    foodN += "Fried chicken skin\n";
                    break;
                default:
                    System.out.println("Invalid food number");
            }
        }

        String drinkN = "";
        int drinkP = 0;
        int drinkS;

        System.out.println("Here is our beverage menu. Please order a beverage");
        System.out.println("1. Ice tea (6000)\n2. Lemon tea (8000) \n3. Mineral water (3000) \n4. Orange juice (11000) \n5. Suspicious drink (99999)");

        while (true) {
            System.out.print("Enter the beverage number (Type 0 to finish): ");
            drinkS = sc.nextInt();
            if (drinkS == 0) {
                break;
            }
            switch (drinkS) {
                case 1:
                    drinkP += 6000;
                    drinkN += "Ice tea\n";
                    break;
                case 2:
                    drinkP += 8000;
                    drinkN += "Lemon tea\n";
                    break;
                case 3:
                    drinkP += 3000;
                    drinkN += "Mineral water\n";
                    break;
                case 4:
                    drinkP += 11000;
                    drinkN += "Orange juice\n";
                    break;
                case 5:
                    drinkP += 99999;
                    drinkN += "Suspicious drink\n";
                    break;
                default:
                    System.out.println("Invalid beverage number");
            }
        }

        int fanddP = drinkP + foodP + totalC;
        if (fanddP >= 50000 && fanddP <= 99999) {
            totalDisc = (int) (fanddP * 0.90);
        } else if (fanddP >= 100000) {
            totalDisc = (int) (fanddP * 0.85);
        }

        int totalDwF = totalDisc + custFee + restauFee;
        int total = (int) (totalDwF * tax);
        pTax = (int) (totalDwF * 0.10);

        System.out.println("Your receipt:");
        System.out.println(eatconcl);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Customer name: " + customerN + "\n" + "Gender: " + genderh);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Food that you ordered:");
        System.out.println(comboN + foodN + drinkN);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (!comboN.isEmpty() || !foodN.isEmpty() || !drinkN.isEmpty()) {
            System.out.println("Original price: " + fanddP + "\n" + "Original discount price: " + totalDisc + "\nCustomer fee: 3000" + "\n" + "Tax (10%): " + pTax);
        } else {
            System.out.println("You did not order anything");
        }

        if (eatconcl.equals("Dine in")) {
            System.out.println("Dine in order");
        } else if (eatconcl.equals("Take away")) {
            System.out.println("Take away order");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total: " + total);
        System.out.println(date);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

