package eu.engeto.calculation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class CalcTest {

    @Test
    public void testScitani () {
        int actual = Calc.scitani(2,3);
        int excpected = 5;

        Assertions.assertEquals(actual, excpected);
    }



//    @Test
//    public void testDeleni () {
//        Exception excepted = Assertions.assertThrows(ArithmeticException.class);
//            Calc.deleni(12,0);
//            Assertions.assertEquals(" / by zero", excepted.getMessage());
//    }







}
