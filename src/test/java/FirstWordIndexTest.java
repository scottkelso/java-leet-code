import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kainos.ea.Solutions;

public class FirstWordIndexTest {
    Solutions s = new Solutions();

    @Test
    public void testStrStrZeroIndex() {
        int actualResult = s.strStr("sadbutsad", "sad");
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStrStrNotFound() {
        int actualResult = s.strStr("leetcode", "leeto");
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
