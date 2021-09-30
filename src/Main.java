import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //THis is a comment
        //Outputting Strings
        System.out.println("Hello world!");
        System.out.println(2 + 2);
        System.out.println("What is 2 + 2 " + (2 + 2));
        System.out.println("What is 2 + 2 " + 2 + 2);


        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

        System.out.println("What is the weather like?");
        String weather = sc.nextLine();
        System.out.println("The weather is " + weather);

        System.out.println("What is the best football team?");
        String team = sc.nextLine();
        int score = 0;
        //Use selection to work out the correct answer
        if (team.equals("Brighton")) {
            System.out.println("Correct!");
            score++;
        } else {
            //If the answer is incorrect then execute the code below
            System.out.println("You are wrong!");
            score--;
        }
        System.out.println("Score is " + score);

    }
}
