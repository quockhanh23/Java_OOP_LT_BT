package Test;

public class Student {
    private String name;
    private int age;
    private int score1;
    private int score2;
    private int totalScore;


    public Student( String name, int age, int score1, int score2) {
        this.name  = name;
        this.age = age;
        this.score1 =score1;
        this.score2 = score2;
        totalScore = this.score1 + this.score2;

    }
}

