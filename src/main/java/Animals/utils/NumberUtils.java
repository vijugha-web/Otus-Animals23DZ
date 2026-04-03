package Animals.utils;

public class NumberUtils {

    public static boolean isNotNumber(String value){
        if (value == null){
            return true;
        }
        return !value.matches("\\d+");
    }
}
