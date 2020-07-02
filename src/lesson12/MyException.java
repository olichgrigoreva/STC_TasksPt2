package lesson12;

public class MyException extends NegativeArraySizeException {
    public MyException(String s) {
        super(s);
    }
}
