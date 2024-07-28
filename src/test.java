import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {

        String s="i have 200 $ money";

        Pattern pt= Pattern.compile("\\d+");
        List<Number> num = new ArrayList<>();

        Matcher mt= pt.matcher(s);
        while (mt.find()){
            num.add(Integer.parseInt(mt.group()));
        }
    }
}
