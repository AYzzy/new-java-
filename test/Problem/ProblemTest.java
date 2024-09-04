package Problem;

import org.junit.jupiter.api.Test;

import static Problem.Types.BUSINESS;
import static Problem.Types.FINANCIAL;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {
    @Test
    public void testToCreateAUnsolvedProblem(){
        Problem problem = new Problem("FOOD",FINANCIAL);
        problem.createAProblem("Ayo",FINANCIAL);
        problem.unSolved();
        assertFalse(problem.isSolved());

    }
    @Test
    public void testToCreateAProblemAndSolveIt(){
        Problem problem = new Problem("attention",BUSINESS);
        problem.createAProblem("Ayo",FINANCIAL);
        problem.solved();
        assertTrue(problem.isSolved());
    }


}
