package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("fullName" + "Dan Volkov");
        student.setGroup("Group" + "auto mechanics");
        student.setReceiptDate("ReceiptDate" +   "  12 April");
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getReceiptDate());
    }
}
