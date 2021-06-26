package bugs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Сделай пожалуйста так чтобы ошибка с java.lang.NoSuchMethodException: bugs.Car.<init>() ушла
 */
public class Bug4 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor<?> constructor = Car.class.getConstructor(String.class);
        Object o = constructor.newInstance("test");
        System.out.println(o);
    }
}

class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}