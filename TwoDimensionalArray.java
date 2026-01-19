public class TwoDimensionalArray {
    public static void main(String[] args){
        String[] clothTypes = {"Shirts", "Pants"};

        //String[][] clothColors = new String[2][3];

        //first method
        /*clothColors[0][0] = "red";
        clothColors[0][1] = "blue";
        clothColors[0][2] = "green";

        clothColors[1][0] = "orange";
        clothColors[1][1] = "yellow";
        clothColors[1][2] = "violet"; */


        //second and much better method
        String[][] clothColors = {
            {"red", "blue", "green"},
            {"orange", "yellow", "violet"},
        };

        for (int i = 0; i < clothColors.length; i++){
            System.out.printf("%-9s ", clothTypes[i]);
            for(int j = 0; j < clothColors[i].length; j++){
                System.out.printf("%-9s ", clothColors[i][j]);
            }
            System.out.println();

        }

       

    }
    



    
}
