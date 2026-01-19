package week2;

public class Week2Activity {
    public static void main(String[] args) {
        
        int[] theaterRow = {0, 0, 0, 1, 0, 0, 0, 0};

        for(int i = 0; i < theaterRow.length; i++) {

            if(theaterRow[i] == 0) {
                System.out.println("Seat " + theaterRow[i] + " is not taken.");
            } else {
                System.out.println("Seat " + theaterRow[i] + " is taken.");
            }
        }


        
    }
    
}
