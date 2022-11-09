package bsu.collocvium;

import bsu.collocvium.functionality.StringFunctionality;
import org.junit.jupiter.api.Test;

public class UnitTest {

    private StringFunctionality functionality = new StringFunctionality();

    @Test
    void testConcatenate() {
        // arrange
        String s1 = "bla";
        String s2 = "alb";

        // act
        String result = functionality.concatenate(s1, s2);

        // assert
        assert result.equals("blaalb");
    }

    @Test
    void testStringCopy() {
        // arrange
        String s = "bla";
        int n = 3;

        // act
        String result = functionality.copyString(s, n);

        // assert
        assert result.equals("blablabla");
    }
}