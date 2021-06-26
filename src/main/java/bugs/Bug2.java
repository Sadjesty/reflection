package bugs;


/**
 * Должен выводить и в первом и во втором вариантах названия класслоадеров
 * в нашем случае это AppClassloader <=> SystemClassloader
 * https://www.javacodegeeks.com/2018/04/jvm-architecture-jvm-class-loader-and-runtime-data-areas.html
 */
public class Bug2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> radomClass = Class.forName("org.apache.commons.lang3.RandomUtils");
        System.out.println(radomClass.getClassLoader());
        Class<?> easyRanndom = Class.forName("org.jeasy.random.EasyRandom");
        System.out.println(easyRanndom.getClassLoader());
    }
}
