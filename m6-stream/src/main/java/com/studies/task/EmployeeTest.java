package com.studies.task;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails

        EmployeeData.readAll().map(Employee::getEmpEmail).forEach(System.out::println);

        //print all phone numbers

        EmployeeData.readAll().map(Employee::getEmpPhoneNumbers).forEach(System.out::println);

        EmployeeData.readAll().
                flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
    }
}
