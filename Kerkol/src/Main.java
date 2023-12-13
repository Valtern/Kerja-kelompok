import java.util.Arrays;
import java.util.Scanner;

class proyek {
    static Scanner sc = new Scanner(System.in);
    static Scanner sp = new Scanner(System.in);

    static String eatcon() {
        System.out.println("Take away or dine in?");
        return sp.next();
    }
    static String comboCon() {
        System.out.println("Welcome to our restaurant ! \nWe currently have a special combo going on right now would you like to order them ? (Yes/No)");
        String comboCon = sc.nextLine();
        return comboCon;
    }
    static String eatcon2() {
        String eatconlus = "";
        eatconlus = eatconlus + eatcon();
        if (eatconlus.endsWith("ake")) {
            System.out.println("Take away order");
            eatconlus = "Take away";
        } else if (eatconlus.endsWith("ine")){
            System.out.println("Dine in order");
            eatconlus = "Dine in";
        }
        return eatconlus;
    }

    public static void main(String[] args) {

        String customerN = "", date = "", gender, confirm, confirm1, confirm2, confirm3;
        String[][] comboArr = new String[10][2];
        String[][] foodArr = new String[10][2];
        String[][] drinkArr = new String[10][2];
        char genderh = 0;
        int totalC = 0, custFee = 3000, totalDisc = 0, pTax, restauFee = 0, comboP, indC1 = 0, indF1 = 0,indD1 = 0;
        double tax = 1.10;
        boolean consent2 = true, consent3 = true, consent4 = true, consent5 = true, comboC = true, foodC = true, drinkC = true;
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
            }

        }
        String consent1 = comboCon();

        if (consent1.equalsIgnoreCase("yes")) {
            System.out.println("The combo that is currently up are: (Max order limit is 10 for combos)");
            System.out.println("1. Chicken fried rice with tea (30000) \n2. Shrimp fried rice with tea (33000) \n3. Chicken katsu (with rice) with lemon tea (31000) \n4. Beef katsu (with rice) with lemon tea (46000) \n5. Goat fried rice with tea (39000)");

            while (consent3) {
                if (!comboC) {
                    System.out.println("Combo you ordered :");
                    for (int i = 0;i < comboArr.length;i++) {
                        for (int j = 0;j < comboArr[0].length;j++) {
                            if (comboArr[i][j] == null) {
                                String rep = "Empty slot";
                                comboArr[i][j] = rep;
                            }
                        }
                        System.out.println(String.join(" | ", comboArr[i]));
                    }
                    System.out.println("Is the item you ordered correct ? (Yes/no) or would you like to clear your selection");
                    confirm1 = sc.next();
                    if (confirm1.endsWith("es")) {
                        consent3 = false;
                    } else if (confirm1.endsWith("o")) {
                        for (String[] row: comboArr) {
                            Arrays.fill(row, null);
                        }
                        indC1 = 0;
                        totalC = 0;
                        comboC = true;
                    }
                }
                while (comboC) {
                    System.out.print("Enter the combo number (Type 0 to finish): ");
                    comboP = sc.nextInt();
                    switch (comboP) {
                        case 1:
                            comboArr[indC1][0] = "Chicken fried rice with tea";
                            comboArr[indC1][1] = "30000";
                            totalC += 30000;
                            indC1++;
                            break;
                        case 2:
                            comboArr[indC1][0] = "Shrimp fried rice with tea";
                            comboArr[indC1][1] = "33000";
                            totalC += 30000;
                            indC1++;
                            break;
                        case 3:
                            comboArr[indC1][0] = "Chicken katsu (with rice) with lemon tea";
                            comboArr[indC1][1] = "31000";
                            indC1++;
                            totalC += 31000;
                            break;
                        case 4:
                            comboArr[indC1][0] = "Beef katsu (with rice) with tea";
                            comboArr[indC1][1] = "46000";
                            indC1++;
                            totalC += 46000;
                            break;
                        case 5:
                            comboArr[indC1][0] = "Goat fried rice with lemon tea";
                            comboArr[indC1][1] = "39000";
                            indC1++;
                            totalC += 39000;
                            break;
                        case 0:
                            comboC = false;
                        default:
                            System.out.println("Invalid combo number");

                    }
                }
            }

        } else {
            System.out.println("You choose not to see the special combo");
        }

        int foodP = 0;
        int foodS;

        System.out.println("Here is our food menu. Please order a food");
        System.out.println("1. Chicken fried rice (27000) \n2. Shrimp fried rice (28000) \n3. Chicken katsu with rice (26000) \n4. Goat fried rice (30000) \n5. Beef katsu with rice (35000) \n6. Fried onion rings (12000) \n7. Fried mushroom (14000) \n8. Fried chicken skin (16000)");
        while (consent4) {
            if (!foodC) {
                System.out.println("Food you ordered: ");
                for (int i = 0;i < foodArr.length;i++) {
                    for (int j = 0;j < foodArr[0].length;j++) {
                        if (foodArr[i][j] == null) {
                            String rep = "Empty slot";
                            foodArr[i][j] = rep;
                        }
                    }
                    System.out.println(String.join(" | ", foodArr[i]));
                }
                System.out.println("Is the food you ordered correct ? (Yes/No) or would you like to clear your selection");
                confirm2 = sc.next();
                if (confirm2.endsWith("es")) {
                    consent4 = false;
                } else if (confirm2.endsWith("o")) {
                    for (String[] row: foodArr) {
                        Arrays.fill(row, null);
                    }
                    indF1 = 0;
                    foodP = 0;
                    foodC = true;
                }
            }
            while (foodC) {
                System.out.print("Enter the food number (Type 0 to finish):  (Max 10)");
                foodS = sc.nextInt();
                switch (foodS) {
                    case 1:
                        foodArr[indF1][0] = "\b\b\bChicken fried rice";
                        foodArr[indF1][1] = "27000";
                        indF1++;
                        foodP += 27000;
                        break;
                    case 2:
                        foodArr[indF1][0] = "\b\b\bShrimp fried rice";
                        foodArr[indF1][1] = "28000";
                        indF1++;
                        foodP += 28000;
                        break;
                    case 3:
                        foodArr[indF1][0] = "\b\b\bChicken katsu with rice";
                        foodArr[indF1][1] = "26000";
                        indF1++;
                        foodP += 26000;
                        break;
                    case 4:
                        foodArr[indF1][0] = "\b\b\bGoat fried rice";
                        foodArr[indF1][1] = "30000";
                        indF1++;
                        foodP += 30000;
                        break;
                    case 5:
                        foodArr[indF1][0] = "\b\b\bBeef katsu with rice";
                        foodArr[indF1][1] = "35000";
                        indF1++;
                        foodP += 35000;
                        break;
                    case 6:
                        foodArr[indF1][0] = "\b\b\bFried onion rings";
                        foodArr[indF1][1] = "12000";
                        indF1++;
                        foodP += 12000;
                        break;
                    case 7:
                        foodArr[indF1][0] = "\b\b\bbFried mushroom";
                        foodArr[indF1][1] = "14000";
                        indF1++;
                        foodP += 14000;
                        break;
                    case 8:
                        foodArr[indF1][0] = "\b\b\bFried chicken skin";
                        foodArr[indF1][1] = "16000";
                        indF1++;
                        foodP += 16000;
                        break;
                    case 0:
                        foodC = false;
                    default:
                        System.out.println("Invalid food number");
                }
            }
        }

        int drinkP = 0;
        int drinkS;

        System.out.println("Here is our beverage menu. Please order a beverage");
        System.out.println("1. Ice tea (6000)\n2. Lemon tea (8000) \n3. Mineral water (3000) \n4. Orange juice (11000) \n5. Suspicious drink (99999)");

        while (consent5) {
            if (!drinkC) {
                System.out.println("Drinks you ordered: ");
                for (int i = 0;i < drinkArr.length;i++) {
                    for (int j = 0;j < drinkArr[0].length;j++) {
                        if (drinkArr[i][j] == null) {
                            String rep = "Empty slot";
                            drinkArr[i][j] = rep;
                        }
                    }
                    System.out.println(String.join(" | ", drinkArr[i]));
                }
                System.out.println("Is drinks you ordered correct ? (Yes/No) or would you like to clear your selection");
                confirm3 = sc.next();
                if (confirm3.endsWith("es")) {
                    consent5 = false;
                } else if (confirm3.endsWith("o")) {
                    for (String[] row: drinkArr) {
                        Arrays.fill(row, null);
                    }
                    indD1 = 0;
                    drinkP = 0;
                    drinkC = true;
                }
            }
            while (drinkC) {
                System.out.print("Enter the beverage number (Type 0 to finish): ");
                drinkS = sc.nextInt();
                switch (drinkS) {
                    case 1:
                        drinkArr[indD1][0] = "\b\bIce tea";
                        drinkArr[indD1][1] = "6000";
                        indD1++;
                        drinkP += 6000;
                        break;
                    case 2:
                        drinkArr[indD1][0] = "\b\bLemon tea";
                        drinkArr[indD1][1] = "8000";
                        indD1++;
                        drinkP += 8000;
                        break;
                    case 3:
                        drinkArr[indD1][0] = "\b\bMineral water";
                        drinkArr[indD1][1] = "3000";
                        indD1++;
                        drinkP += 3000;
                        break;
                    case 4:
                        drinkArr[indD1][0] = "\b\bOrange juice";
                        drinkArr[indD1][1] = "11000";
                        indD1++;
                        drinkP += 11000;
                        break;
                    case 5:
                        drinkArr[indD1][0] = "\b\bSuspicious drink";
                        drinkArr[indD1][1] = "99999";
                        indD1++;
                        drinkP += 99999;
                        break;
                    case 0:
                        drinkC = false;
                    default:
                        System.out.println("Invalid beverage number");
                }
            }
        }

        int fanddP = drinkP + foodP + totalC;
        if (fanddP >= 50000 && fanddP <= 99999) {
            totalDisc = (int) (fanddP * 0.90);
        } else if (fanddP >= 100000) {
            totalDisc = (int) (fanddP * 0.85);
        }
        String eatfinality = "";
        eatfinality = eatfinality + eatcon2();

        int totalDwF = totalDisc + custFee;
        if (eatfinality.equalsIgnoreCase("Take away")) {
            restauFee = 4000;
            totalDwF = totalDwF + restauFee;
        } else if (eatfinality.equalsIgnoreCase("Dine in")){
            eatfinality = "Dine in";
        }
        int total = (int) (totalDwF * tax);
        pTax = (int) (totalDwF * 0.10);

        System.out.println("Your receipt:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Customer name: " + customerN + "\n" + "Gender: " + genderh);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Items that you ordered:\n");
        System.out.println("COMBO");
        for (int i = 0;i < comboArr.length;i++) {
            System.out.println(String.join(" | ", comboArr[i]));
        }
        System.out.println("\n");
        System.out.println("FOOD");
        for (int i = 0;i < foodArr.length;i++) {
            System.out.println(String.join(" | ", foodArr[i]));
        }
        System.out.println("\n");
        System.out.println("DRINKS");
        for (int i = 0;i < drinkArr.length;i++) {
            System.out.println(String.join(" | ", drinkArr[i]));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (eatfinality.equals("Dine in")) {
            System.out.println("Dine in order");
        } else if (eatfinality.equals("Take away")) {
            System.out.println("Take away order");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Original price: " + fanddP + "\n" + "Original discount price: " + totalDisc + "\nCustomer fee: 3000" + "\n" + "Tax (10%): " + pTax);
        System.out.println("Total: " + total);
        System.out.println(date);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}