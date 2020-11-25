package generictypes;

public class MyStack<T extends Comparable> {

    private static final int STACK_SIZE = 10;
    private Object[] tab = new Object[STACK_SIZE];
    private int elementIndex;

    public MyStack() {

    }

    public void push(T newElement) throws Exception {

        if(elementIndex == 0) {
            tab[elementIndex] = newElement;
            return;
        }

        int comparationResult = newElement.compareTo(tab[elementIndex - 1]);
        if (comparationResult == 0) {
            throw new Exception(" This element is already listed ");
        } else if (elementIndex < STACK_SIZE) {
            tab[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Stack full");
        }
    }

    //    public void push(T newElement) throws Exception {
//        if (elementIndex < STACK_SIZE) {
//            tab[elementIndex] = newElement;
//            elementIndex++;
//        } else {
//            throw new Exception("Przepełniony stos");
//        }
//    }

    public T pop() throws Exception {
        if (elementIndex == 0) {
            throw new Exception("Error");
        } else {
            elementIndex--;
        }
        return (T) tab[0];
    }

}
