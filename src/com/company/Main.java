package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого билета");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                showStudents(students);
                return;
            }

            String[] subString = input.split(" ");
            //Если ввести что то вроде "Иванов Иван Иванович ФК-2008 001", то у нас получиться 5 подстрок,
            //если меньше или больше то пользователь ввёл что то не то
            if (subString.length != 5) {
                System.out.println("Данные введены в неверном формате, попробуйте ещё раз");
            } else {
                String name = subString[0];
                String surname = subString[1];
                String patronymic = subString[2];
                String group = subString[3];
                String studentCard = subString[4];

                Student newStudent = new Student(studentCard, name + " " + surname + " " + patronymic, group);

                boolean result = students.add(newStudent);
                if (!result){
                    System.out.println("Студент с номером студенческого билета " + studentCard + " уже существует");
                }
            }
        }
    }

    public static void showStudents(Set<Student> students) {

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
