package generictypes;

public class MyEmployeStack {
    private static final int STACK_SIZE = 10;


    private int elementIndex;
    private Employe[] subtitlesStack = new Employe[STACK_SIZE];


    public void push(Employe newElement) throws Exception {
        if (elementIndex < STACK_SIZE) {
            subtitlesStack[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Przepełniony stos");
        }

    }

    public Employe pop() throws Exception {
        if(elementIndex == 0) {
            throw new Exception();
        }else {
            elementIndex--;
        }
        return subtitlesStack[elementIndex];
    }

    public boolean isEmpty() {
        return subtitlesStack.length == 0;
    }

}
