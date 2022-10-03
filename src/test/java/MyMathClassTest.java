import static org.junit.jupiter.api.Assertions.*;

class MyMathClassTest {
    MyMathClass myMath;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myMath = new MyMathClass();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        myMath = null;
    }

    @org.junit.jupiter.api.Test
    void factorialOfThreeShouldBeSix() {
        assertEquals(6,myMath.factorial(3));
    }
    @org.junit.jupiter.api.Test
    void factorialOfZeroShouldBeOne() {
        assertEquals(1,myMath.factorial(0));
    }
    @org.junit.jupiter.api.Test
    void factorialOfNegativeOneShouldTrowIllegalArgumentExeption() {
        assertThrows(IllegalArgumentException.class,()-> {
            myMath.factorial(-1);
        });
    }

    @org.junit.jupiter.api.Test
    void twoPowerFourShouldBeSixteen() {
        assertEquals(16,myMath.intPow(2,4));
    }
    @org.junit.jupiter.api.Test
    void twoPowerNegativeOneShouldBeHalf() {
        assertEquals(0.5,myMath.intPow(2,-1));
    }

    @org.junit.jupiter.api.Test
    void halfPowerTwoShouldBeQuarter() {
        assertEquals(0.25,myMath.intPow(0.5,2));
    }
}