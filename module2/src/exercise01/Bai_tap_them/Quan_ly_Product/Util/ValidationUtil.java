package exercise01.Bai_tap_them.Quan_ly_Product.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {
    private static final String  NUMBER_REG = "\\d";
    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isNumber(String val){
        pattern = Pattern.compile(NUMBER_REG);
        matcher = pattern.matcher(val);
        return matcher.matches();
    }
}
