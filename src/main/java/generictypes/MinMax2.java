package generictypes;

public class MinMax2<T extends Comparable>{

    private T value1;
    private T value2;

    public MinMax2(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getMin() {
        int i = value1.compareTo(value2);
        if(i <= 0){
            return value1;
        }
        return value2;
    }


}
