package com.xworkz.toString.internal;

public class Notes {
    private String subject;
    private int numberOfPages;
    private String language;

    public Notes(String subject, int numberOfPages, String language) {
        this.subject = subject;
        this.numberOfPages = numberOfPages;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "Subject='" + subject + '\'' +
                ", Number of Pages=" + numberOfPages +
                ", Language='" + language + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return subject.hashCode() + Integer.hashCode(numberOfPages) + language.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Notes) {
                Notes otherNotes = (Notes) obj;
                return this.subject.equals(otherNotes.subject) &&
                        this.numberOfPages == otherNotes.numberOfPages &&
                        this.language.equals(otherNotes.language);
            }
        }
        return false;
    }
}
