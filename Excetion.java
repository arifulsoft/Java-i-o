package aaaaaaaaaaaa;
//Excetion finally
public class Excetion {

    public static void main(String[] args) {

        int[] arr = new int[5];

        String s = null;
        try {
            System.out.println(10 / 0);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            int num=10+5;
            System.out.println(num);
        }
    }
}
