package lesson12;


public class Main {
    public static void main(String[] args) {
        Object unknownObject = null;
        unknownObject.equals("knownObject"); //NullPointerException

        String str1 = "Hello, world!";
        char[] result = str1.toCharArray();
        System.out.println(result.length);
        System.out.println(result[14]); //ArrayIndexOutOfBoundsException

        try {
            int[] array = new int[-2];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
            throw new MyException("Размер массива не может быть отрицательным!");
        }
    }
}
