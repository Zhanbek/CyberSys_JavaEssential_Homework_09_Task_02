package model;

public class Client {
    private int id;
    private String lastName;
    private int age;

    public Client(int id, String lastName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Client {" +
                "id = " + id +
                ", age = " + age +
                ", name='" + lastName + '\'' +
                '}';
    }
}
