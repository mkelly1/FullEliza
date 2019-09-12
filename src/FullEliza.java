import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FullEliza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        boolean quit = true;
        Random rand = new Random();
        boolean hq = false;

        System.out.println("Good day. What is your problem?");
        while(quit){
            System.out.print("Enter your response or 'q' to quit: ");
            response = scan.nextLine().toLowerCase();
            String rebuild = "";
            int rand_therapisth = rand.nextInt(3);
            int rand_therapistq = rand.nextInt(3);
            hq = !hq;
            System.out.println("HQ= "+hq);


            if (response.equalsIgnoreCase("q")) {
                System.out.println("Have a nice day. Ending program.");
                quit = false;
            } else {
                String[] response1 = response.split(" ");

                for (String word : response1) {
                    if (word.equalsIgnoreCase("i")) {
                        word = "you";

                    } else if (word.equalsIgnoreCase("me")) {
                        word = "you";

                    } else if (word.equalsIgnoreCase("my")) {
                        word = "your";
                    } else if (word.equalsIgnoreCase("am")) {
                        word = "are";

                    }rebuild = rebuild + " " + word;
                }

                ArrayList<String>therapistHedge = new ArrayList<>();
                therapistHedge.add("Please tell me more");
                therapistHedge.add("Many of my patients tell me the same thing");
                therapistHedge.add("It is getting late, maybe we had better quit");

                ArrayList<String>therapistQualifier = new ArrayList<>();
                therapistQualifier.add("Why do you say that ");
                therapistQualifier.add("You seem to think that ");
                therapistQualifier.add("So, you are concerned that ");

                if(hq == true){
                    System.out.println(therapistHedge.get(rand_therapisth));}
                else{
                    System.out.println(therapistQualifier.get(rand_therapistq) + rebuild + "?");}
            }
        }
    }
}
