import lmiCalculatorService.LMICalculatorService;
import org.junit.Test;
public class LmiCalculatorTest {
    @Test
    public void testValidPriceOtherAttributesSuccess(){

        //Given
            long amount= 5000;
            double interestRate = 6.99;
            LMICalculatorService calculateService = Mockito.mock(LMICalculatorService.class);

        //When
            double repaymentAmount = 0;
            try{
                repaymentAmount = calculateRepayment(amount, intrestRate);
            }catch (Exception e){
                Assert.fail("Test case should not have failed");
        }

        //Then
        Assert.assertEquals(3224, repaymentAmount);
    }
}
