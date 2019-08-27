import java.util.ArrayList;
import java.util.Collections;
public class Jumpers {
    private ArrayList<Jumper> jumpers;

    public Jumpers () {
        jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper jumper) {
        jumpers.add(jumper);
    }
    public void printTournament () {
        System.out.println("Tournament results:");
    System.out.println("Position    Name");
    int i =0;
        Collections.sort(jumpers, Collections.reverseOrder());
        for (Jumper jumper: jumpers) {
            i++;
            System.out.println(i + "           "+jumper);
            jumper.printLengths();
            System.out.print("\n");
        }
    }
    public void printJumpersScores() {
        int i = 0;
        Collections.sort(jumpers);
        for (Jumper jumper : jumpers) {
            i++;
            System.out.print("  " + i + ". ");
            System.out.println(jumper);
        }
    }
    public void printRoundResults  () {
            for (Jumper jumper : jumpers) {
            jumper.addVotes();
          System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getActualLength());
          jumper.printVotes();
        }
    }
}
