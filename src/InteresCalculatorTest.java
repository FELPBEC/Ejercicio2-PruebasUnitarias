import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InteresCalculatorTest {
    InteresCalculator interesCalculator= new InteresCalculator();
    @Test
    public void montthlyPaymentCorrecTest(){
        assertEquals(30593.2, interesCalculator.monthlyPayment(70000,4, 5),0.1);
    }
    @Test
    public void calculateCompoundSmallValuesTest(){
        assertEquals(375000.0,interesCalculator.calculateCompound(3000, 4, 3),0.1);
    }
    @Test
    public void calculateCompoundBigValues(){
        assertEquals(5.0E7,interesCalculator.calculateCompound(400000, 4, 3) ,0.1);
    }

    @Test
    public void monthlyPaymentprincipalNegativeTest(){
        assertThrows(IllegalArgumentException.class,()->{
            interesCalculator.monthlyPayment(-30000, 4, 2);
        });
    }

    @Test
    public void monthlyCompoundNegativeTest(){
        assertThrows(IllegalArgumentException.class,()->{
            interesCalculator.calculateCompound(-30000, 4, 2);
        });
    }

    @Test 
    public void monthlyPaymentRateNegativeTest(){
        assertThrows(IllegalArgumentException.class, ()->{
            interesCalculator.monthlyPayment(40000, -5, 3);
        });
    }

    public void monthlyCompoundRateNegativeTest(){
        assertThrows(IllegalArgumentException.class, ()->{
            interesCalculator.calculateCompound(40000, -5, 3);
        });
    }
    @Test
    public void monthlyPaymentMontthsNegative(){
        assertThrows(IllegalArgumentException.class,()->{
            interesCalculator.monthlyPayment(40000, 6, -4);
        });
    }
    @Test
    public void monthlyCompundMontthsNegative(){
        assertThrows(IllegalArgumentException.class,()->{
            interesCalculator.calculateCompound(40000, 6, -4);
        });
    }
    @Test
    public void monthlyPaymenthMounthTest(){
        assertTrue(interesCalculator.monthlyPayment(70000,4, 5)>interesCalculator.monthlyPayment(70000,4, 7));
    } 
     
}
