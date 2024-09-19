public class MyStack {
    private boolean isEmpty = true;
    private int numberOfElement=0;

    public boolean isEmpty() {
        //return isEmpty;
        if(numberOfElement == 0)return isEmpty;
        return false;


    }

    public void push(String name) {
        //isEmpty =false;
        numberOfElement++;

    }

    public void pop(String name) {
        if(numberOfElement ==0)
            throw new IllegalArgumentException();
        //isEmpty =true;
        numberOfElement--;
    }

    public void peek(String name) {
        if(numberOfElement==0)
            return;
    }
}
