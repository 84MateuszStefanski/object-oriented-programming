package generictypes;

public class MyStringStack {

    private static final int STACK_SIZE = 10;

    private int elementIndex;
    private String[] subtitlesStack = new String[STACK_SIZE];


    public void push(String newElement) throws Exception {
        if (elementIndex < STACK_SIZE) {
            subtitlesStack[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Przepełniony stos");
        }

    }

    public String pop() throws Exception {
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
