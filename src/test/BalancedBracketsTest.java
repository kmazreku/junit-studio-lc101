package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
     public void bracketsAndStringReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
 }

    @Test
    public void nestedReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void otherNestedReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]Test]"));
    }

    @Test
    public void stringInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void stringSeparatedByBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyLeftBracketsReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void otherOnlyLeftBracketsReturnsReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketsReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void otherOnlyRightBracketsReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void otherMismatchReturnsFalse(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }

}
