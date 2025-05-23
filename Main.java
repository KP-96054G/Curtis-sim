import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        teacher curt = new teacher();
        System.out.println("Welcome to Curtis Sim!");
        while(curt.getScore() > 0){
            runDay(curt);
        }
        
        System.out.println("\nYOU'VE BEEN FIRED");
        
        
        
        
    }
    
    public static void runDay(teacher curt){
        Scanner nxt = new Scanner(System.in);
        System.out.println("\nPress enter to advance day");
        String adv = nxt.nextLine();
        curt.advanceDay();
        curt.startDay();
        curt.event();
        curt.printScore();
        
    }
}
