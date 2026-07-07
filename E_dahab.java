import java.util.Scanner;
public class E_dahab {

    static Scanner input = new Scanner(System.in);

    static int readInt() {
        return input.nextInt();
    }

    static double readDouble() {
        return input.nextDouble();
    }

    static String readWord() {
        return input.next();
    }

    static char readChar() {
        String s = input.next();
        return s.length() > 0 ? s.charAt(0) : ' ';
    }

    public static void main(String[] args) {
        int choises;
        System.out.print("enter service code(*111#): ");
        String serv_code = input.next();
        if (serv_code.equalsIgnoreCase("*111#")) {
            print();
            choises = readInt();
            while (choises != 1 && choises !=2){
                print();
                choises=readInt();
            }
            switch (choises) {
                case 1:
                    dollar();
                    break;
                case 2:
                    shilling();
                    break;
            }
        } else {
            System.out.println("invalid service code.");
        }
    }

    /* qeybta kowaad
       first stage */

    public static void print(){
        System.out.println("\nFadlan dooro Lacagta ");
        System.out.println("1.dollar");
        System.out.println("2.shilling");
        System.out.print("enter your choice: ");
    }

    static void dollar() {
        int choise;
        menu();
        choise = readInt();
        switch (choise) {
            case 1:
                xisaabtaada();
                break;
            case 3:
                Kaarka_hadalka();
                break;
            case 2:
                U_wareeji();
                break;
            case 4:
                ku_ibbso();
                break;
            case 5:
                Lacag_labixid();
                break;
            case 6:
                Dahashiil_akoon();
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

    /* weybt labaaad ee heyso shelling  second main part */
    static void shilling() {
        int choise;
        menu();
        choise = readInt();
        switch (choise) {
            case 1:
                xisaabtaada();
                break;
            case 2:
                U_wareeji();
                break;
            case 3:
                Kaarka_hadalka();
                break;
            case 4:
                ku_iibso();
                break;
            case 5:
                Lacag_labixid();
                break;
            case 6:
                Dahashiil_akoon();
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    public static void menu(){
        System.out.println("\nFadlan Dooro : ");
        System.out.println("1.Xisaabtaada");
        System.out.println("2.U Wareeji");
        System.out.println("3.Kaarka Hadalka");
        System.out.println("4.KU iibso");
        System.out.println("5.Lacag la bixid");
        System.out.println("6.Dahabshiil Akoon");
        System.out.print("enter your choice: ");
    }
    // End Shilling



    // second stage my account
    public static void menu_xisaabta(){
        System.out.println();
        System.out.println("Fadlan Dooro : ");
        System.out.println("1.Itus Haraaga");
        System.out.println("2.Warbixin Kooban");
        System.out.println("3.Badal PIN ka");
        System.out.println("4.Badal luqada");
        System.out.println("5.Liiska Magacyada");
        System.out.println("6.Daryeelka Macaamisha");
        System.out.println("\npress 0 for main menu or * previous menu");
    }

    static void xisaabtaada() {
        char select;
        int pin;
        double balance = 100;
        char star;
        menu_xisaabta();
        System.out.print("enter your choice: ");
        select = readChar();
        switch (select) {
            case '1':
                System.out.println();
                System.out.println("Gali PIN-ka si laguu tusiyo Haraagaaga ");
                pin = readInt();
                if (pin == 1020) {
                    System.out.println();
                    System.out.printf("Haraagaagu waa $%.2f%n", balance);
                } else {
                    do {
                        System.out.println();
                        System.out.println("Waa Qalad PIN k aad Galisay Ku celi markale:");
                        pin = readInt();
                        System.out.println();
                        System.out.printf("Haraagaagu waa $ %.2f%n", balance);
                    } while (pin != 1020);
                }
                break;
            case '2':
                System.out.println("Gali PIN-ka si laguu tusiyo dhaqdhaqaaqii ugu dambeeyay");
                pin = readInt();
                if (pin == 1020) {
                    System.out.println("There are No Transaction to Display");
                } else {
                    do {
                        System.out.println("Waa Qalad PIN k aad Galisay");
                        pin = readInt();
                        if (pin == 1020)
                            System.out.println("NO Transfer ID is Found");
                    } while (pin != 1020);
                }
                break;
            case '3':
                badal_pin();
                break;
            case '4':
                Bedal_luqada();
                break;
            case '5':
                liiska_magacyada();
                break;
            case '6':
                System.out.println("\nWac daryeelka macaamiisha : 152\n");
                break;
            case '*':
                dollar();
                break;
            case '0':
                main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    /* qeybta laga badalo PIN ka case 3  MY Acount */
    static void badal_pin() {
        int oldpin, newpin, checking;
        char star;
        System.out.println();
        System.out.println("geli pin kii hore");
        System.out.println("\npress 0 for main menu");
        oldpin = readInt();
        if (oldpin == 1020) {
            System.out.println("Gali PIN Cusub");
            newpin = readInt();
            System.out.println("Gali PIN xaqiijinta");
            checking = readInt();
            System.out.println("Waad badashay PIN ka");
        } else if (oldpin == 0) {
            main(new String[0]);
        } else {
            System.out.println("Waxaa soo galisay PIN qaldan");
        }
    }
    // END Change PIN  case 3 my account

    // Change language  case 4 my account
    static void Bedal_luqada() {
        int choise;
        System.out.println("Fadlan dooro luqad");
        System.out.println("1.English");
        System.out.println("2.Soomaali");
        choise = readInt();
        switch (choise) {
            case 1:
                System.out.println("\n\n\n");
                System.out.println("Luuqadaadii waxaa u badashay English");
                break;
            case 2:
                System.out.println("\n\n\n");
                System.out.println("Luuqadaadii waxaa u badashay Soomaali");
                break;
        }
    }
    // end change language case 4 my account

    // contacts case 5 my account
    static void liiska_magacyada() {
        int code, code2, choise, contact, ch, pin = 3147;
        String name, surname, country;
        char star;
        System.out.println("Fadlan dooro");
        System.out.println("1. liiska Magacyada Gudaha ");
        System.out.println("2. Liiska Magacyada Dibada");
        System.out.println("\n\n press 0 for main menu and * for previous\n menu");
        choise = readInt();
        switch (choise) {
            case 1:
                System.out.println("Fadlan dooro: ");
                System.out.println("1.Ku dar liiska Gudaha");
                System.out.println("2.Itus liiska Magacyada");
                System.out.println("3.Tirtir Macmiil");
                ch = readInt();
                switch (ch) {
                    case 1:
                        System.out.println("Geli Lambark Macmiilka oo aan wadan Furaha Wadanka");
                        code = readInt();
                        System.out.println("Gali Magaca qofka");
                        name = readWord();
                        surname = readWord();
                        System.out.printf("Ku dar Lambarka Qofka %d \n and magaca %s %s\n Gali PIN ka si aad u xaqiijiso %n", code, name, surname);
                        pin = readInt();
                        if (pin == 1020) {
                            System.out.printf("waxaad gudaha kusoo dartay macaamiil Lambarkiisa %d \n and magaciisa %s %s \n", code, name, surname);
                        } else {
                            do {
                                System.out.println("PIN qalad aad soo galisay");
                                pin = readInt();
                                System.out.printf("waxaad gudaha kusoo dartay macaamiil Lambarkiisa %d \n and magaciisa %s %s \n", code, name, surname);
                            } while (pin != 1020);
                        }
                        break;
                    case 2:
                        System.out.println("Gali PIN ka si aan u Xaqiijino");
                        pin = readInt();
                        if (pin == 1020) {
                            System.out.println("No Contact");
                        } else {
                            do {
                                System.out.println("PIN qalad aad soo galisay");
                                pin = readInt();
                                System.out.println("No Contact");
                            } while (pin != 1020);
                        }
                        break;
                    case 3:
                        System.out.println("No Contact");
                        contact = readInt();
                        System.out.println("Input Entered is Invalid");
                        break;
                }
                break;
            case 2:
                System.out.println("Fadlan dooro: ");
                System.out.println("1.Ku dar liiska Gudaha");
                System.out.println("2.Itus liiska Magacyada");
                System.out.println("3.Tirtir Macmiil");
                ch = readInt();
                switch (ch) {
                    case 1:
                        System.out.println("Geli Lambark Macmiilka oo aan wadan Furaha Wadank");
                        code = readInt();
                        System.out.println("Gali Magaca qofka");
                        name = readWord();
                        surname = readWord();
                        System.out.println("Gali Furuha Wadanka Sida (44)UK");
                        code2 = readInt();
                        System.out.println("Gali Wadanka");
                        country = readWord();
                        System.out.printf("ku dar Liiska magacyada Lambarka %d \n , Magaca: %s %s\n Gali PIN ka si aad u xaqiijiso %n", code, name, surname);
                        pin = readInt();
                        if (pin == 1020) {
                            System.out.println("Success");
                        } else {
                            do {
                                System.out.println("PIN qalad aad soo galisay");
                                pin = readInt();
                                System.out.println("Success");
                            } while (pin != 1020);
                        }
                        break;
                    case 2:
                        System.out.println("Gali PIN ka si aan u Xaqiijino");
                        pin = readInt();
                        if (pin == 1020) {
                            System.out.println("No Contact");
                        } else {
                            do {
                                System.out.println("PIN qalad aad soo galisay");
                                pin = readInt();
                                System.out.println("No Contact");
                            } while (pin != 1020);
                        }
                        break;
                    case 3:
                        System.out.println("No Contact");
                        contact = readInt();
                        System.out.println("Input Entered is Invalid");
                        break;
                }
                break;
            case 0:
                System.out.println("\nmenu and * for previous menu");
                star = readChar();
                if (star == '*')
                    xisaabtaada();
                else if (star == '0')
                    main(new String[0]);
                break;
        }
    }
    // END my account

    // money 2.send money
    static void U_wareeji() {
        String number;
        char star;
        int pin;
        int choose, reciev;
        System.out.println("Fadlan Door : ");
        System.out.println("1.U Wareeji Moobil");
        System.out.println("2.Lacag u Dir Dibada");
        System.out.println("\n\n press 0 for main menu and * for previous\n menu");
        choose = readInt();
        switch (choose) {
            case 1:
                System.out.println("\nFadlan Dooro : ");
                System.out.println("1. Lambar Macmiil");
                System.out.println("2. Liiska Magacyada");
                System.out.println("\npress 0 for main menu and * for previous menu");
                reciev = readInt();
                switch (reciev) {
                    case 1:
                        System.out.println("Gali Lambarka aadlacagta u wareejineyso");
                        number=input.next();
                        if (!number.startsWith("62")){
                            System.out.println("Fadlan ka bilow Number 6XXXXXXXXXX");
                        }
                        else {
                            System.out.println("Gali Lacagta");
                            choose=readInt();
                            if (choose <= 0){
                                System.out.println("invalid money");
                            }
                            else {
                                System.out.println(choose+" Dollar ayaad u wareejinasaa Lambarka \n"+number+".Lacagta " +
                                        "Fadlan Gali \nPIN ka si aad u Xaqiijiso");
                                pin=readInt();
                                if (pin == 1020){
                                    System.out.println();
                                    System.out.println("waxaa "+choose+" Dollar u wareejinasaa Lambarka \n"+number);
                                }
                                else {
                                    do {
                                        System.out.println("You have entered wrong PIN");
                                        pin = readInt();
                                        System.out.println("Success");
                                    } while (pin != 1020);
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("invalid choice.");
                        break;
                }
                break;
            case 2:
                System.out.println("No contact");
                break;
            case 0:
                System.out.println("\nmenu and * for previous menu");
                star = readChar();
                if (star == '*')
                    xisaabtaada();
                else if (star == '0')
                    main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    // End send money

    // SEND MONEY TWO mobile top up
    static void Kaarka_hadalka() {
        char star;
        int num, ch;
        String name, nam, na;
        int pin;
        double money, balance = 100;

        System.out.println("Fadlan Dooro : ");
        System.out.println("1. Aniga");
        System.out.println("2. Qof kale");
        System.out.println("\n\n\n press 0 for main menu and * for previous\n menu");
        ch = readChar();

        switch (ch) {
            case '1':
                System.out.println("Dooro Lambarka Operator-ka");
                System.out.println("1. RECHARGEOPT");
                int choice=readInt();
                if (choice == 1) {
                    System.out.println("fadlan gali lacagta: ");
                    money = readDouble();
                    if (money <= balance) {
                        System.out.println(money+" Dollar ayaad ugu Shubanasaa naftaada\n" +
                                " Fadlan Gali PIN ka si aad u xaqiijiso: ");
                        pin = readInt();
                        if (pin == 1020) {
                            System.out.printf("waxa ku shibatay $ %.2f \n Haraagaau waa %.2f%n", money, balance - money);
                        } else {
                            do {
                                System.out.println("PIN qaldan ayaad soo galisay \n Please Try Again");
                                pin = readInt();
                                System.out.printf("waxa ku shibatay $ %.2f \n Haraagaagu waa %.2f%n", money, balance - money);
                            } while (pin != 1020);
                        }
                    } else {
                        System.out.println("Balance kugu filan mahaysatid");
                    }
                }
                else {
                    System.out.println("waxbo maadan dooran");
                }
                break;
            case '2':
                System.out.println("Gali Lambarka aad lacagta ugu shubayso");
                num = readInt();
                System.out.println("fadlan gali lacagta: ");
                money = readDouble();
                System.out.println(money+" Dollar ayaad ugu Shubanasaa \n " +num+
                        " Fadlan Gali PIN ka si aad u xaqiijiso: ");
                pin = readInt();
                if (pin != 1020) {
                    do {
                        System.out.println("PIN qalad aad soo galisay \n ku celi markale");
                        pin = readInt();
                        System.out.printf("\t$ %.2f dollor ayaad ugu shubatay \n your balance is$ %.2f%n",
                                money, balance - money);
                    } while (pin != 1020);
                } else {
                    System.out.printf("waxa ku shibatay $ %.2f \n Haraagaau waa %.2f%n", money, balance - money);
                }
                break;
            case '*':
                dollar();
                break;
            case '0':
                main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    public static void ku_iibso(){
        System.out.println("Fadlan Dooro: ");
        System.out.println("1.Ku iibso  ");
        System.out.println("2.Bixi Fee ama Bill");
        System.out.println("\n\n\n press 0 for main menu and * for previous\n menu");
    }
    public static void ku_iibso1(){
        System.out.println("Fadlan Dooro: ");
        System.out.println("1. Itus ama Bixi Fee ");
        System.out.println("2. Itus ama Bixi Bill");
        System.out.println("\npress 0 for main menu and * for previous\n menu");
    }

    public static void ku_iibso2(){
        System.out.println();
        System.out.println("Fadlan Dooro: ");
        System.out.println("1. Itus Fee_ga ");
        System.out.println("2. Bixi Fee-ga");
        System.out.println("\npress 0 for main menu and * for previous\n menu");
    }
    public static void ku_iibso3(){
        System.out.println();
        System.out.println("Fadlan Dooro: ");
        System.out.println("1. Itus Biil ");
        System.out.println("2. Bixi Biil");
        System.out.println("\npress 0 for main menu and * for previous\n menu");
    }

    /* Payment */
    static void ku_ibbso() {
        int pay, number, view, fee;
        char star;
        ku_iibso();
        pay = readChar();
        switch (pay) {
            case '1':
                System.out.println("Gali lumbarka Ganacsiga");
                number = readInt();
                System.out.println("Koodka ganacsiga lama helin");
                break;
            case '2':
                ku_iibso1();
                fee = readChar();
                switch (fee) {
                    case '1':
                        ku_iibso2();
                        view = readChar();
                        switch (view) {
                            case '1':
                                System.out.println("Coming Soon");
                                break;
                            case '2':
                                System.out.println("Coming Soon.");
                                break;
                            case '*':
                                ku_iibso1();
                            case '0':
                                main(new String[0]);
                                break;
                        }
                        break;
                    case '2':
                        ku_iibso3();
                        view = readChar();
                        switch (view) {
                            case '1':
                                System.out.println("Coming Soon");
                                break;
                            case '2':
                                System.out.println("Coming Soon.");
                                break;
                            case '*':
                                ku_iibso1();
                            case '0':
                                main(new String[0]);
                                break;
                        }
                        break;
                }
                break;
            case '*':
                dollar();
            case '0':
                main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

    static void Lacag_labixid() {
        int code, chose, pin;
        char star;
        double balances = 100, amount;
        System.out.println("Fadlan Dooro: ");
        System.out.println("1.Lagac la bixid");
        System.out.println("2.Xaqiiji Lacag la bixidan");
        System.out.println("\n\npress 0 for main menu and * for previous menu");
        chose = readChar();

        switch (chose) {
            case '1':
                System.out.println("Gali Lambarka ganacsadaha aad lacag u wareejinayso");
                code = readInt();
                System.out.println("Fadlan gali lacagta");
                amount = readDouble();

                if (amount <= balances) {
                    System.out.println("Gali PIN ka Si loo xaqiijiyo:");
                    pin = readInt();
                    if (pin == 1020) {
                        System.out.printf("%.2f dollors you are requesting Cash out \n from Other Network merchant code\n %d , \n Now the Balance is %.2f dollors%n",
                                amount, code, balances - amount);
                    } else {
                        do {
                            System.out.println("You have entered wrong PIN");
                            pin = readInt();
                            System.out.printf("%.2f dollors you are requesting Cash out \n from Other Network merchant code\n %d , \n Now the Balance is %.2f dollors%n",
                                    amount, code, balances - amount);
                        } while (pin != 1020);
                    }
                } else {
                    System.out.println("balance kugu filan maheysatid");
                }
                break;
            case '2':
                System.out.println("NO Transfer ID is Found");
                break;
            case '*':
                dollar();
            case '0':
                main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    // END CASH

    // DAHABSHIIL BANK
    static void Dahashiil_akoon() {
        int sel, selects, choose, pin;
        char star;
        int amount, balance = 100, number;
        System.out.println("Please Select\n");
        System.out.println("1.Itus Haraaga");
        System.out.println("2.Lacag Dhigasho");
        System.out.println("3.Lacag kala Bax Xisaabta Bangiga");
        System.out.println("4.Warbixin Kooban");
        System.out.println("\n\n\n press 0 for main menu and * for previous\n menu");
        selects = readChar();
        switch (selects) {
            case '1':
                System.out.println();
                System.out.println("Macmiil looma diiwaan gelin wax xisaab Bangi ah");
                break;
            case '2':
                System.out.println();
                System.out.println("Fadlan dooro: ");
                System.out.println("1.Aniga");
                System.out.println("2.Qof kale ");
                System.out.println("\npress 0 for main menu and * for previous menu");

                sel = readChar();
                switch (sel) {
                    case '1':
                        System.out.println("Majiro xisaab bangi la xiriira");
                        break;
                    case '2':
                        System.out.println("Dooro Bangiga");
                        System.out.println("1.DAHABSHIIL BANK");
                        choose = readInt();
                        if (choose == 1){
                            System.out.println("Geli akoon lambarka aad u wareejinayso ");
                            number = readInt();
                            System.out.println("Gali lacagta");
                            amount = readInt();
                            if (amount <= balance) {
                                System.out.println(amount+" Dollar ayaad u wareejinaysaa Xisaabta Bangiga ee: "+number + "\n" +
                                        "gali PIN ka si aan u Xaqiijino");
                                pin = readInt();
                                if (pin == 1020) {
                                    System.out.printf("%d dollors ayaad u wareejisay bangiga -%d \n", amount, number);
                                } else {
                                    do {
                                        System.out.println("PIN qaldan ayaad Galisay ku celi markale: ");
                                        pin = readInt();
                                        System.out.printf("%d dollors ayaad u wareejisay bangiga -%d \n", amount, number);
                                    } while (pin != 1020);
                                }
                            } else {
                                System.out.println("balance kugu filan maheysatid");
                            }
                        }
                        else {
                            System.out.println("invalid choice");
                        }
                        break;
                    case '*':
                        Dahashiil_akoon();
                        break;
                    case '0':
                        dollar();
                }
                break;
            case '3':
                System.out.println("Wax bangi diwaan gilsan maan helin");
                break;
            case '4':
                System.out.println("Wax bangi diwaan gilsan maan hellin");
                break;
            case '*':
                dollar();
            case '0':
                main(new String[0]);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
    // End Dahabshiil bank
}