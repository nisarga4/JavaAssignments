package com.xworkz.toString.internal;

public class Notes {
    private String subject;
    private int pages;
    private boolean handwritten;

    public Notes(String subject, int pages, boolean handwritten) {
        this.subject = subject;
        this.pages = pages;
        this.handwritten = handwritten;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "Subject='" + subject + '\'' +
                ", Pages=" + pages +
                ", Handwritten=" + (handwritten ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 26026;
    }
}
