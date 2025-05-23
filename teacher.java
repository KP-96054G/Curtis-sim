public class teacher {
    
    private String name;
    private int day;
    private int score;
    
    public teacher(){
        name = "Curtis";
        day = 0;
        score = 100;
    }
    
    public void advanceDay(){
        day++;
    }
    
    public void startDay(){
        System.out.println("Day: " + day);
    }
    
    public void event(){
        int choose = (int)(Math.random() *10) + 1;
        //System.out.println(choose);
        event er = new event();
        score -= er.runEvent(choose);
        
    }
    
    public void printScore(){
        System.out.println("Score: " + score);
    }
    
    public int getScore(){
        return score;
    }
    
     
}
