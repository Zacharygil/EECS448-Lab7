import static org.junit.Assert.*;

/**
 * Created by Zacula on 3/30/17.
 */
public class MatrixMethodsTest {


    @org.junit.Test
    public void setMatrix() throws Exception {
    //create matrix and test putting stuff in it
    assertTrue(MatrixMethodsTest.setMatrix(0).equals("something you set"));
    }

    @org.junit.Test
    public void getMatrix() throws Exception {
        //create matrix and test how it outputs
        assertTrue(MatrixMethodsTest.getMatrix(0).equals("something you get"));
    }

    @org.junit.Test
    public void inverse() throws Exception {
        //make a matrix, find the inverse by hand, make that a hand found matrix
        //then plug in the orignal matrix to inverse() and compare
        assertEquals("Handcreated inverse", MatrixMethodsTest.inverse()."original matrix");
    }

    @org.junit.Test
    public void determinant() throws Exception {
        //make a matrix, hand-find the determinant, plug in matrix to determinant()
        // compare values to see if equal.
        assertEquals("answer", MatrixMethodsTest.determinant(), "a");
    }

}