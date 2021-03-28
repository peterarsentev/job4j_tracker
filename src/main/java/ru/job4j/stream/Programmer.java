package ru.job4j.stream;

public class Programmer {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String education;
    private double salary;

    static class Builder {
        private String name;
        private String surname;
        private int age;
        private String gender;
        private String education;
        private double salary;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder buildEducation(String education) {
            this.education = education;
            return this;
        }

        Builder buildSalary(double salary) {
            this.salary = salary;
            return this;
        }

        Programmer build() {
            Programmer programmer = new Programmer();
            programmer.name = name;
            programmer.surname = surname;
            programmer.age = age;
            programmer.gender = gender;
            programmer.education = education;
            programmer.salary = salary;
            return programmer;
        }
    }

    @Override
    public String toString() {
        return "Builder{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + ", gender='" + gender + '\''
                + ", education='" + education + '\''
                + ", salary=" + salary
                + '}';
    }

    public static void main(String[] args) {
        Programmer programmer = new Builder().buildName("name")
                .buildSurname("surname")
                .buildAge((byte) 35)
                .buildGender("M")
                .buildEducation("University")
                .buildSalary(500000)
                .build();
        System.out.println(programmer);
    }
}
