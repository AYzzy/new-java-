package Problem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Problem>problems = new ArrayList<>();
    int countProblems =0;
    int totalNumberOfUnsolved =0;

    public int countOfProblem() {
        return countProblems;
    }

    public Problem createProblem(String name, Types types) {
        Problem problem = new Problem("name",types);
        problems.add(problem);
        countProblems++;
        return problem;
    }

    public void removeProblem(String name) {
        String person = findByName(name);
        countProblems--;
    }

    private String findByName(String name) {
        for(Problem problem: problems){
            if(problem.getName().equals(name)){
                return name;
            }
        }
        return name;
    }

    public int countOfUnsolved() {
        totalNumberOfUnsolved +=countOfProblem();
        return totalNumberOfUnsolved;
    }
}
