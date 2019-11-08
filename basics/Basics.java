import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello everyone It is Java Programming. It is not funny");
        
        
        //GingerCold practice with trainer
        if(isGingerCold()){
            System.out.println("get ginger a swater");
        } else{
            System.out.println("may be we should shave gingers");
        }

        //calling the pluraliz function here
        int dogCount = 1;
        System.out.println("I own " +dogCount+ " "+ pluraliz("dog", dogCount));

        int catCount = 2;
        System.out.println("I own " +catCount+ " "+ pluraliz("cat", catCount));
        
        int turtleCount = 3;
        System.out.println("I own " +turtleCount+ " "+ pluraliz("turtle", turtleCount));

        //calling flipcoint
        flipNHeads(5);

        //calling Clock method
        clock();

    }

    public static void clock(){
        Boolean isPrinted = false;
        int lastPrintedSecond = 61;
        //for (int i =0; i < 10; i++){

    while(true){
        

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int seconds = now.getSecond();
        
        if (!isPrinted && lastPrintedSecond != seconds){    
        System.out.println("hour"+hour+ "minute" +minute+ "seconds" +seconds);
        System.out.println("Time :"+hour +":"+ minute +":"+ seconds);
        lastPrintedSecond = seconds;
        isPrinted = false;
        }
    
    }
        
}  

    //}

    public static boolean isGingerCold(){
        //System.out.println("yes is GingerCold called");
        Calendar cal = Calendar.getInstance();
        String currentMonth = new SimpleDateFormat("MMM").format(cal.getTime());
        //System.out.println("The month is : " +currentMonth);

        if(currentMonth.equals("Nov") || currentMonth.equals("Dec") || currentMonth.equals("Jan") || currentMonth.equals("Feb")){
            //System.out.println("with in the true if");
            return true;
            
        } else{
            return false;
        }
        
    }

    public static void flipNHeads(int num){
        System.out.println("flipNHeads Starts here ");
        int counter =0;
        int flipCount = 0;
    
        do{
            flipCount = flipCount + 1;
            if(flip().equals("Heads")){
                counter=counter+1;
            }else{
            }
        }while (counter < num);

        System.out.println("It took "+flipCount+" flips to flip " +num+ " heads in a row.");

    }

    public static String flip(){
        //generate random number
        if (Math.random() < 0.5){
            System.out.println("Heads");
            return "Heads";
            }else{
            System.out.println("Tails");
            return "Tails";
            }
    }

    public static String pluraliz (String word, int num){
        if(num > 1){
            return word+"s";
        }
        return word;
    }
}