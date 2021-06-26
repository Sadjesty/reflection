package bugs;

/*1) напиши программу, в которой попробуй сделать так чтобы ты смогу к строке добавить символы(модифицировать строку)
 и при этом чтобы hashcode данной строки не изменился, и изменения остались (адрес памяти не поменялся) - используй для этого рефлексию
        String str = "test";
        int hashBeforeChanges = str.hash();
        ...//модификация строки
        int hashAfterChanges = str.hash();
        sout(hashBeforeChanges == hashAfterChanges);//должно вернуть true*/

import java.lang.reflect.Field;

public class Exercise1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String test = "test";
        int hashBeforeChanges = test.hashCode();

        Class<? extends String> stringClass = test.getClass();
        Field valueField = stringClass.getDeclaredField("value");
        valueField.setAccessible(true);
        byte[] value = (byte[]) valueField.get(test);
        value[0] = 'N';
        value[1] = 'a';

        System.out.println(test);

        value = new byte[] {'t', 'e', 's', 't', 'A', 'd', 'd'};
        valueField.set(test, value);

        int hashAfterChanges = test.hashCode();

        System.out.println(test);
        System.out.println(hashBeforeChanges == hashAfterChanges);
    }
}
