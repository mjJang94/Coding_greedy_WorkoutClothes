import org.junit.Test;
import static org.junit.Assert.*;


public class SolutionTest {

    @org.junit.Test
    public void SolutionTest(){

        Solution solution= new Solution();

        assertEquals(2, solution.solution(4, new int[]{1, 2, 3}, new int[]{3,4}));
        assertEquals(3, solution.solution(3, new int[]{1, 3, 4}, new int[]{1, 3, 4}));
        assertEquals(5, solution.solution(5, new int[]{1, 3, 4}, new int[]{1, 3, 5}));
        assertEquals(5, solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, solution.solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(2, solution.solution(3, new int[]{3}, new int[]{1}));
    }


}
