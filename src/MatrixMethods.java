/**
 * Created by Zacula on 3/30/17.
 */
public class MatrixMethods {
    //Globals
    double [][] matrix;
    int GenSize = 0;


    //Make the matrix
    public MatrixMethods(int InputSize){
        GenSize = InputSize;
        matrix = new double[GenSize][GenSize];

    }


private String ConvertToString(double[] ArrayAsDouble) {
    String ArrayAsString;
    for(int i = 0; i <  ArrayAsDouble.length; i ++) {
        ArrayAsString = ArrayAsString + ArrayAsDouble[i];
        int count = ArrayAsDouble.length;
        if(i <  (count - 1)) {
            ArrayAsString = ArrayAsString + " ";
        }//end if
    }// end for loop
    return ArrayAsString;
}//end convert to strimg
    private double[] ConvertToDouble(String ArrayAsString) {
        int place = 0;
        double[] ArrayAsDouble = new double[GenSize];
        String[] EndingStringAmounts = ArrayAsString.split(" ");//using split
        for(String CurrentstringAmount : EndingStringAmounts)
        {
            ArrayAsDouble[place] = Double.parseDouble(CurrentstringAmount);
            place = place + 1;
        } // end for loop
        return ArrayAsDouble;
    }  //end ConvertToDouble


//getters setters

    public void setMatrix(int row, String strng) {
       int place = row;
        matrix[place] = ConvertToDouble(strng);
    }

    public String getMatrix(int row) {
        String strng = ConvertToString(matrix[row]);
        return strng;
    }



    public  MatrixMethods Inverse(){
        return matrix;
    }

    public double Determinant(){
        return double;
    }




}
