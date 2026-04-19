import java.util.*;
public class NumberGuesser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Caution please do not invite demonic influence to the program. Thank you.");
        System.out.println("Welcome to number palozza. A premier number guessing game.");
        startgame(sc);
        sc.close();
    }
    static void startgame(Scanner sc){
        int select=0;

        int i;
        do{
            menu();
            try { 
                select= sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input try again");
                sc.nextLine();
                continue;
            }

            switch(select){
                case 1:
                    System.out.println("You have selected easy mode");
                    Random numez = new Random();
                    int numberez = numez.nextInt(100)+1;
                    int chancesez = 10;

                    for(i = 0; i < chancesez; i++){// Loop for number of chances
                        System.out.println("Enter your guess:");
                        int guess=0;
                        try {
                            guess = sc.nextInt();
                        } catch (Exception e) {
                           System.out.println("Only numbers allowed.");
                           sc.nextLine();
                           continue;
                        }
                        sc.nextLine();
                        if (guess == numberez){
                            System.out.println("You got it!");
                            System.out.println("My number was "+ numberez);
                            System.out.println("and it only took you " + (i+1) + " guesses!");
                            if (!playagain(sc)) select =4;
                            break;
                        }else if (guess >= numberez - 10 && guess < numberez){
                            System.out.println("Your really close on the low end!");
                        }else if (guess > numberez && guess <= numberez + 10){
                            System.out.println("Your really close on the high end!");
                        }else if (guess < numberez){
                            System.out.println("Too low! Try again.");
                        } else if (guess > numberez){
                            System.out.println("Too high! Try again.");
                        }
                    }
                    if (i == chancesez) {
                        System.out.println("Game over! The number was " + numberez);
                        if (!playagain(sc)) select =4;
                    }
                    break;
                case 2:
                    System.out.println("You have selected medium mode");
                    Random nummed = new Random();
                    int numbermed = nummed.nextInt(1000)+1;
                    int chancesmed = 5;

                    for(i = 0; i < chancesmed; i++){// Loop for number of chances
                        System.out.println("Enter your guess:");
                        int guess=0;
                        try {
                            guess = sc.nextInt();
                        } catch (Exception e) {
                           System.out.println("Only numbers allowed.");
                           sc.nextLine();
                           continue;
                        }
                        sc.nextLine();
                        if (guess == numbermed){
                            System.out.println("You got it!");
                            System.out.println("My number was "+ numbermed);
                            System.out.println("and it only took you " + (i+1) + " guesses!");
                            if (!playagain(sc)) select =4;
                            break;
                        }else if (guess <= numbermed - 5 && guess < numbermed){
                            System.out.println("Your really close on the low end!");
                        }else if (guess >= numbermed + 5 && guess > numbermed){
                            System.out.println("Your really close on the high end!");
                        }else if (guess < numbermed){
                            System.out.println("Too low! Try again.");
                        } else if (guess > numbermed){
                            System.out.println("Too high! Try again.");
                        }
                    }
                    if (i == chancesmed) {
                        System.out.println("Game over! The number was " + numbermed);
                        if (!playagain(sc)) select =4;
                    }
                    break;
                case 3:
                    System.out.println("You have selected HARD MODE! Number is between 1 and 10000");
                     Random numhard = new Random(); 
                    int numberhard = numhard.nextInt(10000)+1;
                    int chanceshard = 3;

                    for(i = 0; i < chanceshard; i++){// Loop for number of chances
                        System.out.println("Enter your guess:");
                        int guess=0;
                        try {
                            guess = sc.nextInt();
                        } catch (Exception e) {
                           System.out.println("Only numbers allowed.");
                           sc.nextLine();
                           continue;
                        }
                        sc.nextLine();
                        if (guess == numberhard){
                            System.out.println("You got it!");
                            System.out.println("My number was "+ numberhard);
                            System.out.println("and it only took you " + (i+1) + " guesses!");
                            if (!playagain(sc)) select =4;
                            break;
                        }else if (guess < numberhard){
                            System.out.println("Too low! Try again.");
                        } else if (guess > numberhard){
                            System.out.println("Too high! Try again.");
                        }else if (i == chanceshard){
                            System.out.println("Game over! The number was " + numberhard);
                            playagain(sc);
                        }
                        if (i == chanceshard) {
                        System.out.println("Game over! The number was " + numberhard);
                        if (!playagain(sc)) select =4;
                    }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                case 666:
                    System.out.println("YOUR SOUL IS FORFEIT!!!!");
                    System.out.println("Once chance a number between 6 and 66666666");
                    Random numdevil = new Random();
                    int numberdevil = numdevil.nextInt(66666666-6)+6;
                    int guess=0;
                     try {
                            guess = sc.nextInt();
                        } catch (Exception e) {
                           System.out.println("Only numbers allowed.");
                           sc.nextLine();
                           continue;
                        }
                    if(guess == numberdevil){
                        System.out.println("How the hell ahh whatever your free to go");
                        System.out.println("My number was "+ numberdevil);
                        
                        
                    } else {
                            System.out.println("HAHAHA OF COURSE YOU COULDNT GET IT BABY BIG CRY BABY LOSER");
                            System.out.println("The number was "+ numberdevil);
                            break;
                        }
                
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }while(select != 4);
       
    }
    static boolean playagain(Scanner sc) {
        System.out.println("Wanna try again? (y/n)");
        String input = sc.nextLine().trim().toLowerCase();
        if (input.equals("y")) {
            return true;  
        } else {
            System.out.println("Thanks for playing!");
            return false;  
        }
    }
    static void menu(){
        System.out.println("Select your difficulty (1-3)");
        System.out.println("1. Easy || 2. Medium");
        System.out.println("3. Hard || 4. Quit Game");

    }
}
