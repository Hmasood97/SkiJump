
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class UserInterface {
    private ArrayList<Integer> lengths;
    private Scanner reader;
    private Jumpers jumpers;
    public UserInterface () {
        this.reader = new Scanner(System.in);
        jumpers = new Jumpers();
    }
    public void startTournament() {
        int i =0;
        int j =0;
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        System.out.println("  Participant name:");
        String name = reader.nextLine();
        while (!name.isEmpty()) {
            jumpers.addJumper(new Jumper(name,0));
            System.out.println("  Participant name:");
            name = reader.nextLine();
        }
        System.out.println("The tournament begins!");
        System.out.println();
        System.out.println("Write \"jump\" to jump; otherwise you quit: ");
        String jumpCommand = reader.nextLine();
        while (jumpCommand.equals("jump")) {
                i = i+1;
                j = j+1;
                System.out.println("Round " + i);
                System.out.println();
                System.out.println("Jumping order:");
                jumpers.printJumpersScores();
                System.out.println("Results of round " + i);
                jumpers.printRoundResults();
                System.out.println("Write \"jump\" to jump; otherwise you quit: ");
                jumpCommand = reader.nextLine();
        }
        System.out.println("");
        System.out.println("Thanks!");
        jumpers.printTournament();
    }

    /*public void printInfo(Jumper jumper) {
        System.out.println(jumper.getName());
        System.out.println("length: " + jumper.getLength());
        jumper.printVotes();
    }*/
}
