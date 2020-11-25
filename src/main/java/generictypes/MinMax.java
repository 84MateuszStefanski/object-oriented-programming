package generictypes;

public class MinMax<T extends Comparable> {

    T value1;
    T value2;

    public MinMax(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getMin() {
        int comparationResult = value1.compareTo(value2);
        if(comparationResult >= 0) {
            return value2;
        }
        return value1;
    }

    public T getMax() {
        int comparationResult = value1.compareTo(value2);
        if(comparationResult >= 0) {
            return value1;
        }
        return value2;
    }
}
