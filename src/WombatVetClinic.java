import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class WombatVetClinic {
    public static void main(String[] args) throws SeverityOutOfBoundsException {
//        Queue<Wombat> wombatQueue = new ArrayDeque<Wombat>();
        Queue<Wombat> wombatQueue = new PriorityQueue<Wombat>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String text = sc.nextLine();
            if (text.equalsIgnoreCase("quit")) {
                break;
            } else if (text.equalsIgnoreCase("PROCESS")) {
                // Process the queue and print details
                while (!wombatQueue.isEmpty()) {
                    System.out.println(wombatQueue.poll());
                }
            } else {
                String[] input = text.split(" ");
                if (input.length == 3) {
                    try {
                        String name = input[0];
                        int severity = Integer.parseInt(input[1]);
                        double time = Double.parseDouble(input[2]);
//                    int severity = sc.nextInt();
//                    double time = sc.nextDouble();
                        Wombat wombat = new Wombat(text, severity, time);
                        wombatQueue.add(wombat);
                    } catch (SeverityOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }


        }
        sc.close();
//        wombatQueue.add(new Wombat("Fluffy",5,10.5));
//        wombatQueue.add(new Wombat("Socks",10,11.3));
//        wombatQueue.add(new Wombat("Barry",10,10.8));
//        wombatQueue.add(new Wombat("Jobe",3,12.0));
//        wombatQueue.add(new Wombat("Ginger",15,3.2));
        while (!wombatQueue.isEmpty()) {
            System.out.println(wombatQueue.poll());
        }

    }

}
