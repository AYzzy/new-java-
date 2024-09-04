package Problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Problem.Types.*;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;
    @BeforeEach
    public void setPerson(){
        person = new Person();
    }
    @Test
    public void testThatThereIsNoProblem(){
        assertEquals(0,person.countOfProblem());
    }
    @Test
    public void testToCreateAProblem(){
        person.createProblem("food",BUSINESS);
        assertEquals(1, person.countOfProblem());
    }
    @Test
    public void testToCreateMultipleProblem(){
        person.createProblem("food",BUSINESS);
        person.createProblem("construction",EDUCATION);
        person.createProblem("work",FINANCIAL);
        assertEquals(3, person.countOfProblem());
    }
    @Test
    public void testToCreateProblemAndSolveIt(){
        person.createProblem("food",BUSINESS);
        person.createProblem("construction",EDUCATION);
        person.createProblem("work",FINANCIAL);
        assertEquals(3, person.countOfProblem());
        person.removeProblem("food");
        assertEquals(2, person.countOfProblem());
    }
    @Test
    public void testToCreateProblemAndSolveIt2(){
        person.createProblem("food",BUSINESS);
        person.createProblem("construction",EDUCATION);
        person.createProblem("work",FINANCIAL);
        person.createProblem("family",SPIRITUAL);
        assertEquals(4, person.countOfProblem());
        person.removeProblem("food");
        person.removeProblem("family");
        assertEquals(2, person.countOfProblem());
    }
    @Test
    public void testToCountTheTotalUnsolved(){
        person.createProblem("food",BUSINESS);
        person.createProblem("construction",EDUCATION);
        person.createProblem("work",FINANCIAL);
        assertEquals(3, person.countOfProblem());
        person.removeProblem("food");
        assertEquals(2, person.countOfProblem());
        assertEquals(2, person.countOfUnsolved());
    }

}
