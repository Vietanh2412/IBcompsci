package bis;


import java.util.Scanner;

 

public class escape {

 

            static int[][] maze = new int[16][4];

            static String[] nar = new String[16];

            static int cR;

            static boolean exit;

            public static void main(String[] args) {

                        // Create an instance of the escape object.

                        // The constructor class will populate the initial arrays & set the start position.

                        escape game1 = new escape();

                       

                        // While the user doesn't want to exit, and they're still in the maze.

                        while(cR!=15 && exit !=true)

                        {

                                    // Print narrative

                                    System.out.println(nar[cR]);

                                    // Choose direction

                                    int tempDir = game1.chooseDirection();

                                    if(tempDir==9)

                                    {

                                                break;

                                    }

                                    // Check direction

                                    if(game1.checkDirection(tempDir, cR)==true)

                                    {

                                                cR = maze[cR][tempDir];

                                    }

                                    else

                                    {

                                                System.out.println("You walked into a wall dummy");

                                    }

                                    // More or not

                        }
            }
            public escape() {

                        // Sets the current room = 0 to begin with and exit = false.

                        cR=0;
                        exit=false;
                        // Nested loop to traverse the 2D array.
                        
                        for(int x =0;x<16;x++) {
                                    for(int y=0;y<4;y++)
                                    {
                                                // Populate each position with -1 (meaning we can't go that way)

                                                maze[x][y]=-1;
                                    }
                        }
                        // Populate specific positions with the value of the room you will enter into if you go that way.

                        maze[0][1]=1;

                        maze[1][1]=2;

                        maze[1][2]=5;

                        maze[1][3]=0;

                        maze[2][1]=3;

                        maze[2][3]=1;

                        maze[3][2]=7;

                        maze[3][3]=2;

                        maze[4][1]=5;

                        maze[4][2]=8;

                        maze[5][0]=1;

                        maze[5][3]=4;

                        maze[6][1]=7;

                        maze[7][0]=3;

                        maze[7][3]=6;

                        maze[8][0]=4;

                        maze[8][1]=9;

                        maze[8][2]=12;

                        maze[9][3]=8;

                        maze[10][1]=11;

                        maze[10][2]=14;

                        maze[11][2]=15;

                        maze[11][3]=10;

                        maze[12][0]=8;

                        maze[12][1]=13;

                        maze[13][1]=14;

                        maze[13][3]=12;

                        maze[14][0]=10;

                        maze[14][3]=13;

                        maze[15][0]=11;
                     
                        // Populate the narrative array with the correct terms.
                        nar[0] = "You are in Ms Rojas' room, you must escape before she gives you mas tarea!";
                        nar[1] = "You are in Ms Black's room, you must escape before she gives you coloring work";
                        nar[2] = "You are in Mr Mortimer's room, you must escape before he gives you chemical to drink";
                        nar[3] = "You are in Mr Crofts' room, you must escape before he tell you to tug your shirt in";
                        nar[4] = "You are in Mr Casey's room, you must escape now before he make you wear a mask";
                        nar[5] = "You are in Mr Airdrie's room, you must run now before he make you go to SHAFT";
                        nar[6] = "You are in Mr Langford's room, you must get out of there before he make you run 5 laps around the school";
                        nar[7] = "You are in Mr Hooley's room, you must escape before you get 3 suicides";
                        nar[8] = "You are in Mr Webb's room, escape before he drop 3 on your head in basketball";
                        nar[9] = "You are in Ms Davis' room, escape before she give you a thousand words essay";
                        nar[10] = "You are in Ms Airdrie's room, escape before she make you laugh";
                        nar[11] = "You are in Mr Hoare's room, Hide your phone before it get taken away";
                        nar[12] = "You are not in a room but next Cuong so run now before he poke you";
                        nar[13] = "You are in the corridor so dont run or you gonna get punch";
                        nar[14] = "You are in the male toilet so dont let the boy in there touch you";
                        nar[15] = "You escaped the school, congratulation";
            }
            public int chooseDirection()
            {
                        Scanner kb = new Scanner(System.in);
        System.out.println("Which direction do you want to go?");
        String t = kb.nextLine();
        if (t.toLowerCase().contentEquals("n"))
        {
            return 0;
        }
        if(t.toLowerCase().contentEquals("e"))
        {
            return 1;
        }
        if(t.toLowerCase().contentEquals("s"))
        {
            return 2;
        }
        if(t.toLowerCase().contentEquals("w"))
        {
            return 3;
        }
        return 9;
            }
            public boolean checkDirection(int dir, int room)
            {
                        if(maze[room][dir]== -1)
                        {
                                    return false;
                        }
                        else
                        {
                                    return true;
                        }
            }
}