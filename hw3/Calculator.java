public class Calculator {
    public static <T extends Number, U extends Number> double sum (T num1, U num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T extends Number, U extends Number> double multi (T num1, U num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public static <T extends Number, U extends Number> double div (T num1, U num2){
        return num1.doubleValue() / num2.doubleValue();
    }
    public static <T extends Number, U extends Number> double sub (T num1, U num2){
        return num1.doubleValue() - num2.doubleValue();
    }
}
