/*
 * Programmer Name: Marcus Brown
 * Class Name: Project2
 * Date: 2/23/2023
 * Course CIS1500 A1513
 * Purpose Statement: Produce an application that produces four different patterns, one after another.
 */

public class Project2 {
    public static void main(String[] args)  {
        
        // Declaring values
        int rows, columns, space, extraSpace;
        

        // Pattern A
        for( rows = 0; rows < 10; rows++){
            for(columns = 0; columns < (rows + 1); columns++){
            System.out.print("*");
            }
            System.out.println();
        } 
    

        // Pattern B
        for(rows = 10; rows > 0; rows--){
            for(columns = 0; columns < rows; columns++){
            System.out.print("*");
            }
            System.out.println();
        }


        // Pattern C

        for(rows = 10; rows > 0; rows--){
            for(columns = 10; columns > rows; columns--){
                System.out.print(" ");
            
            }
            for(space = 0; space < rows; space++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        // Pattern D

        for (rows = 10; rows > 0; rows--) {
            // print spaces before asterisks
            for (space = 1; space < rows; space++) {
                System.out.print(" ");
            }
            // print asterisks
            for (extraSpace = rows; extraSpace <= 10; extraSpace++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}
