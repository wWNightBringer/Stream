package HomeWork1;

import java.time.LocalDate;


public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthday;
    private int INN;
    private Sex sex;
    private LocalDate dateOfWorkUp;
    private LocalDate dateOfWorkDown;
    private int earn;


    public Employee(String name, String surname, String patronymic,
                    LocalDate birthday, int INN, Sex sex, LocalDate dateOfWorkUp, LocalDate dateOfWorkDown, int earn) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.INN = INN;
        this.sex = sex;
        this.dateOfWorkUp = dateOfWorkUp;
        this.dateOfWorkDown = dateOfWorkDown;
        this.earn = earn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getINN() {
        return INN;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfWorkUp() {
        return dateOfWorkUp;
    }

    public void setDateOfWorkUp(LocalDate dateOfWorkUp) {
        this.dateOfWorkUp = dateOfWorkUp;
    }

    public LocalDate getDateOfWorkDown() {
        return dateOfWorkDown;
    }

    public void setDateOfWorkDown(LocalDate dateOfWorkDown) {
        this.dateOfWorkDown = dateOfWorkDown;
    }

    public int getEarn() {
        return earn;
    }

    public void setEarn(int earn) {
        this.earn = earn;
    }

    public enum Sex {
        MALE, FEMALE
    }
}
