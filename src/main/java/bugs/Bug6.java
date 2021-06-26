package bugs;

/**
 * Посчитать сумму чисел в строке
 * например "123"=1+2+3=6
 * например "1234"=1+2+3+4=10
 * например "5234"=5+2+3+4=14
 * <p>
 * баг в том что программа считает некорректно; необходимо пофиксить и объяснить
 */
public class Bug6 {
    public static void main(String[] args) {
        String numberAsString = "5234";
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            char strElement = numberAsString.charAt(i);
            sum += Integer.parseInt(String.valueOf(strElement));
        }

        System.out.println("Sum = " + sum);
    }
}
