package bugs;


import java.lang.reflect.Field;

/**
 * Сделай пожалуйста так чтобы "color" в объекте цветов менялся
 * в конечном результате необходимо получить
 * Flower{color='red'}
 */
public class Bug5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object flower = new Flower();
        Field color = Flower.class.getDeclaredField("color");
        color.setAccessible(true);
        color.set(flower, "red");
        System.out.println(flower);
    }
}

class Flower {
    private String color;

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                '}';
    }
}

