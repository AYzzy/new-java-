package Problem;

public class Problem {
    private String name;
    private Types types;
    private boolean isSolved;

    public Problem(String name,Types types){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void solved(){
        isSolved =true;
    }
    public void unSolved(){
        isSolved =false;
    }


    public void createAProblem(String name,Types types) {
    }

    public boolean isSolved() {
        return isSolved;
    }
}
