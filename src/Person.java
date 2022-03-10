public class Person {
    private String name;
    private int age;
    private double weight;
    private double heigth;

    Person(String name, int age, double weight, double heigth) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.heigth = heigth;
        if (age < 0) {
            throw new IllegalArgumentException("не правильный возраст");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("не правильный вес");
        }
        if (heigth < 0) {
            throw new IllegalArgumentException("не правильный рост");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        check(age);
        this.age = age;
    }
    public void setWeight(double weight) {
        check(weight);
        this.weight = weight;
    }
    public void setHeigth(double height) {
        check(height);
        this.weight = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    private void check(int a){
        if (a < 0) {
            throw new IllegalArgumentException("не правильный возраст");
        }
    }
    private void check(double a){
        if (a < 0) {
            throw new IllegalArgumentException("не правильный возраст");
        }
    }
}