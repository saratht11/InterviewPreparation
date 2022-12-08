package misc;
public class PickKthDigit {

    public void printKthDigit(int num, int k) {
        System.out.println((int) (num / Math.pow(10, k)) % 10);
    }

    public static void main(String[] args) {
        new PickKthDigit().printKthDigit(123, 0);
        new PickKthDigit().printKthDigit(123, 1);
        new PickKthDigit().printKthDigit(123, 2);
        new PickKthDigit().printKthDigit(123, 3);
    }

}
