package other;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array; // непонятно к какому массиву обращаемся и наполняем
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}