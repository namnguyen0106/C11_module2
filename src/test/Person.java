package src.test;

public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Tên='" + name + '\'' +
                ", tuổi=" + age +
                ", địa chỉ='" + address + '\'';
    }
}
