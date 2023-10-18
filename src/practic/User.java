package practic;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20){
            throw new IllegalNameException("Имя не должно бытть длинее чем 20 символов");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 1 || age > 100){
            throw new IllegalAgeException("Возраст не должен быть меньше 1 и больше 100");
        }
        this.age = age;
    }
}
