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
        double determinant;
        MatrixMethods SmallMat = new MatrixMethods(GenSize - 1);
        int row = 0;
        int column = 0;
        for(int i = 0; i < GenSize; i++)
        {
            
           //making the array smaller for determinant opperations 
            for(int j = 0; j < GenSize; j++)//for loop 1
            {
                if (j == 0) {
                    for (int k = 0; k < GenSize; k++)//for loop2
                    {
                        if (k == i) {
                            SmallMat.matrix[row][column] = matrix[i][k];
                            column = column + 1;
                        }//end k if 
                    }// end for loop2
                    row++;
                } //end i if 
            }//end for loop 1
            //-- ending the shrinking of the array
            
            
            determinant = determinant + Math.pow(-1.0, (double)i) * matrix[0][i] * SmallMat.matrix[row][column];
        }



        return determinant;
    }




}
