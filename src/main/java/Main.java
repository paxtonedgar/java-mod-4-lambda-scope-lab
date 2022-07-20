import java.util.function.UnaryOperator;

public class Main {
    public static UnaryOperator<String> operator = str -> str;

    public static void main(String[] args) {
        String PREFIX = "__prefix__";
        String SUFFIX = "__suffix__";
        String res = operator.apply(PREFIX +"hello"+ SUFFIX);
        System.out.println(res); // __prefix__hello__suffix__
    }
}
