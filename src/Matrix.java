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

        //simple check for input arguments
        if(args.length< 2){
            System.out.println("Inadequate amount of arguments");
        }
        //putting the files in.
        Input = new BufferedReader(new FileReader(args[0]));
        Output = new BufferedWriter(new FileWriter(args[1]));

    }

}//end classMatrix

