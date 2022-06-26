package JAVA;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private LocalDate birthDay;
    private String address;
    private String gender;
    List<Course> courseList;

    public Student(String name, LocalDate birthDay, String address, String gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthDay, student.birthDay) && Objects.equals(address, student.address) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDay, address, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", courseList=" + courseList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
