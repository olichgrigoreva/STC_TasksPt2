package lesson12;


public class Main {
    public static void main(String[] args) {
        Object unknownObject = null;
        try {
            unknownObject.equals("knownObject"); //NullPointerException
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException: " + ex.getMessage());
        }

        String str1 = "Hello, world!";
        char[] result = str1.toCharArray();
        try {
            System.out.println(result[14]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }

        try {
            int[] array = new int[-2];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
            throw new MyException("Размер массива не может быть отрицательным!");
        }
    }
}
