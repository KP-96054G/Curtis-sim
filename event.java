import java.util.Scanner;
public class event {
    
    
    
    public event(){
        
    }
    
    public int runEvent(int val){
        Scanner even = new Scanner(System.in);
        if(val == 1){
            System.out.println("Your lunch burnt in the microwave... What do you eat?");
            String food = even.nextLine();
            System.out.println("The " + food + " upset your stomach. -5 tp");
            return 5;
        }
        if(val == 5){
            System.out.println("Your students are angry at you for skipping class. They complained to the principal. -15 tp");
            return 15;
        }
        if(val == 4){
            System.out.println("Code HS is down. What site do you use");
            String site = even.nextLine();
            System.out.println(site + " gave you a virus. -10 tp");
            return 10;
        }
        if(val == 3){
            System.out.println("Uh-oh! You have to go pee and the bathroom is closed! What do you do?");
            String piss = even.nextLine();
            System.out.println("No time for that! You has an 'accident' and had to go home. -15 tp");
            return 15;
        }
        if(val == 2){
            System.out.println("You lost your computer in the closet?");
            int place = (int)(Math.random() * 9) + 1;
            System.out.println("-------------");
            System.out.println("| 1 | 2 | 3 |");
            System.out.println("| 4 | 5 | 6 |");
            System.out.println("| 7 | 8 | 9 |");
            System.out.println("-------------");
            System.out.println("Where is it?");
            int where = even.nextInt();
            if(where == place){
                System.out.println("You Found it! +10 tp");
                return -10;
            }
            System.out.println("Nope! -20 tp");
            return 20;
            
        }
        if(val == 7){
            System.out.println("Your car wouldn't start. You didn't make it to school. -20 tp");
            return 20;
            
        }
        if(val == 8){
            System.out.println("You got on the news! What do you say?");
            String say = even.nextLine();
            System.out.println("You were fined by the International Assiocation for your comments. -5 tp");
            return -5;
        }
        if(val == 9){
            System.out.println("What does 'CSA' stand for?");
            String stand = even.nextLine();
            if(stand.toUpperCase().equals("CURTIS SIM (IS) AMAZING")){
                System.out.println("Correct! +15 tp");
                return -15;
            }
            System.out.println(stand + " is wrong. Correct answer withheld. -25 tp");
            return 25;
        }
        if(val == 10){
            System.out.println("Your student is failing and asks for an A. What do you give him?");
            String grade = even.nextLine();
            if(grade.toUpperCase().equals("A")){
                System.out.println("Yes! +15 tp");
                return -15;
            }
            System.out.println("No! -25 tp!!!");
            return 25;
        }
        int add = (int)(Math.random() * 6) + 1;
        System.out.println("Nothing happened today! " + "+" + add + " tp");
        return -add;
    }
}
