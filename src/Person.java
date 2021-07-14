public class Person {
    private String name;
    private int age;

    public Person(){  //default constructor

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
