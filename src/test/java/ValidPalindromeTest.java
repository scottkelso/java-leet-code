import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kainos.ea.Solutions;

public class ValidPalindromeTest {
    Solutions s = new Solutions();

    @Test
    public void testValidPalindrome() {
        boolean actualResult = s.isPalindrome("A man, a plan, a canal: Panama");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testInvalidPalindrome() {
        boolean actualResult = s.isPalindrome("race a car");
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testOnlySpace() {
        boolean actualResult = s.isPalindrome(" ");
        Assertions.assertTrue(actualResult);
    }
}
