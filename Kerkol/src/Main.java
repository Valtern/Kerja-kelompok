import java.util.Arrays;
import java.util.Scanner;

class proyek {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String customerN = "", date = "", gender, eatconcl = "", confirm, confirm1, confirm2, confirm3;
        String[][] comboArr = new String[10][2];
        String[][] foodArr = new String[10][2];
        String[][] drinkArr = new String[10][2];
        char genderh = 0;
        int totalC = 0, custFee = 3000, totalDisc = 0, pTax, restauFee = 0, comboP, indC1 = 0, indF1 = 0,indD1 = 0;
        double tax = 1.10;
        boolean consent2 = true, consent3 = true, consent4 = true, consent5 = true, comboC = true, foodC = true, drinkC = true;

        String eatmetConc = eatcon();
        if (eatmetConc.endsWith("ake")) {
            restauFee = 4000;
            eatconcl = "Take away";
            System.out.println("Take away order");
        } else if (eatmetConc.endsWith("ine")) {
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
            }

        }
        System.out.println("Welcome to our restaurant ! \nWe currently have a special combo going on right now would you like to order them ? (Yes/No)");
        String consent1 = sc.next();

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
    }
     static String eatcon() {
        System.out.println("Take away or dine in?");
        String eatcon = sc.nextLine();
        return eatcon;
    }

}
