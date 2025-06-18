import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kainos.ea.Solutions;

public class IsSubsequenceTest {
    Solutions s = new Solutions();

    @Test
    public void testValidSubsequence() {
        boolean actualResult = s.isSubsequence("abc", "ahbgdc");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testInvalidSubsequence() {
        boolean actualResult = s.isSubsequence("axc", "ahbgdc");
        Assertions.assertFalse(actualResult);
    }
}
