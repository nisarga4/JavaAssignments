package com.xworkz.multilevel;

class Language {
    void communicate() {
        System.out.println("Language is used to communicate.");
    }
}

class ProgrammingLanguage extends Language {
    void writeCode() {
        System.out.println("Programming language is used to code.");
    }
}

class Java extends ProgrammingLanguage {
    void compile() {
        System.out.println("Java code is compiled.");
    }
}
