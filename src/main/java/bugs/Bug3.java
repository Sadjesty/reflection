package bugs;

/**
 * Сделай так чтобы корректно выводилась информация про юзера(в читабельном виде)
 */
public class Bug3 {
    public static void main(String[] args) {
        User user = new User("name");
        System.out.println(user);
    }
}


class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}