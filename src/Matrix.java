/**
 * Created by Zachary Gilchrist.
 */


import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Matrix
{

    public static void main(String[] args)

    {

       //file in - file out initialization
        BufferedReader Input = null;
        BufferedWriter Output = null;
        // variable for parsing
        int counter;

        //simple check for input arguments
        if(args.length< 2){
            System.out.println("Inadequate amount of arguments");
        }
        //putting the files in.
        Input = new BufferedReader(new FileReader(args[0]));
        Output = new BufferedWriter(new FileWriter(args[1]));

    while((counter = Integer.parseInt(Input.readLine())) !=0) {
        MatrixMethods matrix = new MatrixMethods(counter);
        String Row; // needs to be outside of for loop
        double Determinant = 0;
        for(int i = 0; i < counter; i++){

            Row = Input.readLine(); //error to handle IO.exception
            matrix.setMatrix(i); //method from matrixmethods.java
            // setMatrix not made yet but asssumed
            Output.write(Row);//IoException error
        } //end for loop


        //Using the Determinant method in MatrixMethod and placing that in output file
        Determinant = matrix.Determinant();
            Output.write("det = " + Determinant); //error to handle IO.exception
         //Using the Inverse method in MatrixMethods and placing that in the output file
        MatrixMethods matrixInv = matrix.Inverse();
        Output.write("Minv =  "); //error to handle IO.exception
                for(int j = 0; j < counter; i++)
                {
                    Output.write(matrixInv.getMatrix(j));
                }//end inverse for loop


    }//end while loop


        //Will need to implement try/catch for IOException

        
return;

    }//end main

}//end classMatrix

