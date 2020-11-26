import java.util.*;

//@author Edwin E! Salinas

public class HedgeFunD {
    public static void main(String []args) throws Exception {
       static String[][] XL = {  {"0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"X"," "," "," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," "," "}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," "," "," "," "," "," "," "," "}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," "," "}
                                ,{"0"," ","0"," "," "," "," "," "," "," "," "," ","0"," ","0"," ","0"," ","0"," "," "}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," "," "}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," "," "," "," "," "," "," "," "," "," "," "," "}
                                ,{"0"," "," "," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," "," "," "," "," "," "," ","0"," ","0"}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," "," "," ","0"," ","0"}
                                ,{"0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," "," "," ","0"," ","0"}
                                ,{"0"," ","0"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","0"," ","0"}
                                ,{"0"," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," ","0"," ","0"," "," "," ","0"," ","0"," "," "," "," "," "," "," "," "," "," "}
                                ,{"0"," "," "," "," "," "," "," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," "," "," ","0"," ","0"," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","0"}
                                ,{"0"," "," "," ","0"," ","0"," ","0"," ","0"," "," "," ","0"," ","0"," ","0"," ","E"}};
       
  
        
       /*
       
       Mazes do not output correctly at this time. I want to imlement a maze that will be navigated
       using North, South, East, and West directions. Items will be collected automatically as they are encountered in the maze and
       the user would be prompted that they recieved the item.
       
       static String[][] S = {   {S, E S, W, E S, W}
                                ,{N E S, N W, E S, N E S W, S W}
                                ,{N E S, E W, N S W, N E S, N S W}
                                ,{N E, E S W, N E S W, N S W, N M}
                                ,{E, N W, N, N E H1, E W X1}};
       
       static String[][] M = {   {S, E S, W, E S, W, E S, W, E T, E W, S W}
                                ,{N E S, N W, E S, N E S W, S W, N S, E S, E W, E W, N S W}
                                ,{N E S, E W, N S W, N E S, N S W, N S, N E S, E S W, E W, N S W}
                                ,{N E, E S W, N E S W, N S W, N M, N E S, N S W, N E, S W, N S}
                                ,{E, N W, N, N E H1, E W X1, N W, N E, E W, N E S W H2, N W}
                                ,{E S, E W, E W, E W, E S W, E W, E S W, E, N S, S}
                                ,{N E S, E W, E W, S W, N S, E S, N E S W, E S W, N S W, N S}
                                ,{N E S, E W, E W, N E S W, N E S W, N S W, N S, N E, N E S W, N S W}
                                ,{N E S, E S W, S W, N S, N S, N S, N S, E S, N S W, N S}
                                ,{N S X2, N, N E, N W, N, N E, N E W, N E W, N E W, N W}};
       
       static String[][] L = {   {S, E S, W, E S, W, E S, W, E T, E W, S W, E S, S W, E S, E W, W}
                                ,{N E S, N W, E S, N E S W, S W, N S, E S, E W, E W, N S W, N S, N E, N S W, E S, S W}
                                ,{N E S, E W, N S W, N E S, N S W, N S, N E S, E S W, E W, N S W, N E S, E W, N E S W, N S W, N E X3}
                                ,{N E, E S W, N E S W, N S W, N M, N E S, N S W, N E, S W, N S, N S, E S, N S W, N E S, S W}
                                ,{E, N W, N, N E H1, E W X1, N W, N E, E W, N E S W H2, N W, N, N E S, N W, N E, N S W}
                                ,{E S, E W, E W, E W, E S W, E W, E S W, E, N S, S, E S, N E S W, E S W, E W, N W}
                                ,{N E S, E W, E W, S W, N S, E S, N E S W, E S W, N S W, N S, N S, N S, N E S, E S W, S W}
                                ,{N E S, E W, E W, N E S W, N E S W, N S W, N S, N E, N E S W, N S W, N S, N S, N E, N S W, N S}
                                ,{N E S, E S W, S W, N S, N S, N S, N S, E S, N S W, N S, N E S, N E W, E S W, N E S W, N W}
                                ,{N S X2, N, N E, N W, N, N E, N E W, N E W, N E W, N W, N S, E, N E S W, N E W, S W}
                                ,{N E S, E W, E W, E S W, E W, E S W, E W, W, E S, E W, N E S W, W, N E, W, N S}
                                ,{N E S, E S W, E S W, N E S W, E S W, N E W, E S W, E S W, N E W, E S W, N E S W, E W, E S W, E W, N S W}
                                ,{N S, N E, N S W, N S, N E S, W, N S, N W, E W, N S W, N E, E W, N E S W, E S W, N S W}
                                ,{N E S, W, N E, N E W, N S E, E, N E S W, E W, N W, N S, N E, N S W}
                                ,{N E, E W, E W, W, N, E G, E W, N W, E, N E W, W, E, N E W, E W, N W}};
                                
       
        static String[][] XL = { {S, E S, W, E S, W, E S, W, E T, E W, S W, E S, S W, E S, E W, W, E, E W, E S W, E W, W}
                                ,{N E S, N W, E S, N E S W, S W, N S, E S, E W, E W, N S W, N S, N E, N S W, E S, S W, E S, W, N S, E G, S W}
                                ,{N E S, E W, N S W, N E S, N S W, N S, N E S, E S W, E W, N S W, N E S, E W, N E S W, N S W, N E X3, N E W, E W, N E W, E S W, N W}
                                ,{N E, E S W, N E S W, N S W, N M, N E S, N S W, N E, S W, N S, N S, E S, N S W, N E S, S W, S, S, E, N E S W, S W}
                                ,{E, N W, N, N E H1, E W X1, N W, N E, E W, N E S W H2, N W, N, N E S, N W, N E, N S W, N E, N E W, E W, N E S W, N W}
                                ,{E S, E W, E W, E W, E S W, E W, E S W, E, N S, S, E S, N E S W, E S W, E W, N W, E, E W, E S W, N E W, W}
                                ,{N E S, E W, E W, S W, N S, E S, N E S W, E S W, N S W, N S, N S, N S, N E S, E S W, S W, E S, S W, N S, E S, S W}
                                ,{N E S, E W, E W, N E S W, N E S W, N S W, N S, N E, N E S W, N S W, N S, N S, N E, N S W, N S, N S, N E S, N E S W, N E W, N S W}
                                ,{N E S, E S W, S W, N S, N S, N S, N S, E S, N S W, N S, N E S, N E W, E S W, N E S W, N W, N E, N S W, N E S, E W, N W}
                                ,{N S X2, N, N E, N W, N, N E, N E W, N E W, N E W, N W, N S, E, N E S W, N E W, S W, S E, N E W, N E W, E S W, S W}
                                ,{N E S, E W, E W, E S W, E W, E S W, E W, W, E S, E W, N E S W, W, N E, W, N S, N E S, S W, E S, N E S W, N S W}
                                ,{N E S, E S W, E S W, N E S W, E S W, N E W, E S W, E S W, N E W, E S W, N E S W, E W, E S W, E W, N S W, N E S, N E W, N E S W, N S W, N}
                                ,{N S, N E, N S W, N S, N E S, W, N S, N W, E W, N S W, N E, E W, N E S W, E S W, N S W, N S E, E S W, N E S W, N E W, S W}
                                ,{N E S, W, N E, N E W, N S E, E, N E S W, E W, N W, N S, N E, N S W, N E S, N S W, N E S, S W, N}
                                ,{N E, E W, E W, W, N, E G, E W, N W, E, N E W, W, E, N E W, E W, N W, N E S, N E W, N E S W, N E W, W}
                                ,{W, E W, E S W, E, S, E G, E W, S W, E S, S W, E S, S W, S, E S, E S W, N S W, S, N S, S, S}
                                ,{W, E W, N E W, E S W, N E W, E S W,  E W, N E S W, N W, N E, N E S W, N E S W, N S E, N E, N S W, N E S, N E S W, N E S W, N E S W, N S W}
                                ,{S, E S, E W H3, N E S W, E S W, N E W, E S W, N S W, E S, E S W, N E W, N E W, N E S W, S W, N E S, N E W, N S W, N S, N E S, N S W}
                                ,{N E S, N W, E S, N E S W, N S W, S, N E, N E W, N E S W, N S W, E S, E S W, N W, N E S, N E W, W, N E S, N E W, N S W, N S}
                                ,{N S X3, W, N E W, N W, N E, N E W, E W, E W, N E W, N W, N E, N E W, E W, N W, E, E W, N E W, E W, N E W, N W}};
       
             System.out.println("Please select a maze size: S, M, L, XL");
    String scnr = new Scanner(System.in).next();
    
    static String[][] Selection;
    
    if (scnr.equalsIgnoreCase("XL")){
        [] Selection = [] S 
    }
    
    if (scnr.equalsIgnoreCase("L")){
        [] Selection = [] S 
    }
    
    if (scnr.equalsIgnoreCase("M")){
        [] Selection = [] S 
    } else (scnr.equalsIgnoreCase("S")){
        [] Selection = [] S 
    }       
       */
       
       
static boolean isDone;
static int xPlayer;
static int yPlayer;

//gives story intro
System.out.println("You awaken with a pounding headache. You stand up and see that you are in a corridor.\n"
        + "The area is overseen by a castle. You don't know how you got to where you are, but you know you have to get out.");

//draws the maze until it is finished
public static void isDone(String []args){
    while(!isDone){
        printMaze();
        readInput();    
    }
}

//prints the updated maze after each move
static void printMaze(){
    int height = Selection.length;
    for(int y = 0; y < height; y++){
        int width = Selection[0].length;
        for(int x = 0; x < width; x++){
            System.out.print(Selection[x][y]);
            if(x == xPlayer && y == yPlayer){
                System.out.print("X");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//gives basic instrucions
static void readInput(){
    System.out.print("D - move East\tB - move West\t\nW - move North\t\tS - move South\nH for help");
    System.out.print("Enter your move: ");
    String scnr = new Scanner(System.in).next();

    //accpets input
    if (scnr.equalsIgnoreCase("D")){
        xPlayer = xPlayer + 1;
    }
    
    if (scnr.equalsIgnoreCase("A")){
        xPlayer = xPlayer - 1;
    }
    
    if (scnr.equalsIgnoreCase("W")){
        yPlayer = yPlayer = 1;
    }
    
    if (scnr.equalsIgnoreCase("S")){
        yPlayer = yPlayer - 1;
    }
    if (scnr.equalsIgnoreCase("H")){
       System.out.println("Type a cardinal compass direction to move in that direction one step a time.\n"
               + "E - move East\tB - move West\t\nN - move North\t\tS - move South\t\nH for help");

    //quit the game
    if (scnr.equalsIgnoreCase("quit")){
        isDone = true;
        System.out.println("Would you like to play again? Y or N");
        if (scnr.equalsIgnoreCase("N"))
                {System.out.println("Thanks for playing!");}
        else{printMaze();
    }
    }
    //completes the game
    if ((xPlayer = 19) && (yPlayer = 19)){
        isDone = true;
        System.out.println("You made it out of the maze, but are you free?");
        System.out.println("Thanks for playing!");
    }}
}
}
}
