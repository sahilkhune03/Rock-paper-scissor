import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    



    public static void main(String[] args) {
        int count,usercount=0,comcount=0,taidcount=0;
        for(count=0;count<5;count++) {
            System.out.println("ENTER YOUR CHOICE:\n1.STONE\n2.PAPER\n3.Scissor");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            if (user == 1)
                System.out.println("User choose: stone");
            else if (user == 2)
                System.out.println("User choose: Paper");
            else if (user == 3)
                System.out.println("User choose: Scissor");
            else
                System.out.println("Wrong Input");

            Random rand = new Random();
            int computer = rand.nextInt(3);
//        System.out.println(computer);
            if (computer == 0)
                System.out.println("computer choose: stone");
            else if (computer == 1)
                System.out.println("computer choose: Paper");
            else
                System.out.println("computer choose: Scissor");

            if (user == 1 && computer == 0 || user == 2 && computer == 1 || user == 3 && computer == 2) {
                System.out.println("MATCH IS TAID\n");
                taidcount++;
            }
            else if (user == 1 && computer == 2 || user == 2 && computer == 0 || user == 3 && computer == 1)
            {
                System.out.println("YOU WIN!\n");
                usercount++;
            }

            else{
                System.out.println("COMPUTER WIN!\n");
                comcount++;
            }
        }
        System.out.println("YOU WIN "+ usercount+" TIMES");
        System.out.println("COMPUTER WIN "+ comcount+" TIMES");
        System.out.println("TAID "+ taidcount+" TIMES");
        
    }} 

