package lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        final String regex = "\\bбяка\\b";
        final String string = "Бяка БЯКА бяка кулебяка бяКа. AbC Byaka BYAKA byaka kulebyaka. AbC";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.replaceAll("вырезано цензурой"));
        }
    }
}
