package bugs;

/*2) создай модель User, определи 2 приватных поля, и 2 конструктора: с параметрами и без
        2.1) создай объект типа User с помощью рефлексии
        2.2) поменяй каждое из полей на какие-либо новые значения посредством рефлексии*/

import java.lang.reflect.Field;

public class Exercise2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object user = new MyUser();
        System.out.println("Before: " + user);

        Class<?> userClass = user.getClass();

        Field name = userClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user, "Sadjesty");

        Field age = userClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user, 22);

        System.out.println("After: " + user);
    }
}

class MyUser {

    private String name;
    private int age;

    public MyUser() {
        name = "default";
        age = 18;
    }

    public MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
