import java.util.Random;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Jumper implements Comparable<Jumper> {
    private int length;
    private int points;
    private String name;
    private int[] votes;
    private ArrayList<Integer> lengths;
    private List <Jumper> jumpero;

    public Jumper(String name, int points) {
        this.length = length;
        this.points = points;
        this.name = name;
        this.votes = new int[5];
        this.lengths = new ArrayList<Integer>();
    }

    public int getPoints() {
        return this.points;
    }

    public int getLength() {
        Random rand = new Random();
        this.length = rand.nextInt(59) + 60;
        this.lengths.add(this.length);
        return this.length;
    }

    public int getActualLength() {
        return length;
    }

    public void addLengths() {
        lengths.add(this.getLength());
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.getPoints() + " points)";
    }

    public void addVotes() {
        Random rand = new Random();
        //Jumper jumper = new Jumper();
        //this.votes = new int[5];
        int total = 0;
        int actualTotal = 0;
        for (int i = 0; i < 5; i++) {
            votes[i] = rand.nextInt(9) + 10;
            total = total + votes[i];
        }
        Arrays.sort(votes);
        int minValue = votes[0];
        int maxValue = votes[votes.length - 1];
        actualTotal = total - maxValue - minValue;
        this.points = actualTotal + points + this.getLength();
    }

    public void printVotes() {
        System.out.println("    judge votes: " + Arrays.toString(votes));
    }

    public void printInfo() {
        printVotes();
    }

    public void printLengths() {
        System.out.print("            jump lengths: ");
        int i = 0;
        for (Integer item : lengths) {
            if (i < lengths.size() - 1) {
                System.out.print(item + " m, ");
            } else {
                System.out.print(item + " m");
            }
            System.out.print("");
            i++;
        }
    }
   /* public List<Jumper> comparePoints() {
        Collections.sort(jumpero);
        Collections.reverse(jumpero);
        return jumpero;
    }*/

    @Override
    public int compareTo(Jumper o) {
        if (this.points==o.points) {
            return 0;
        }
        else if (this.points >o.getPoints()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

