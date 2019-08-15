package TemplateMethodMode;

public class Main {
    public static void main(String[] args) {
        Exam paperA = new PaperA();
        paperA.question1();

        PaperB paperB = new PaperB();
        paperB.question1();

    }
}
