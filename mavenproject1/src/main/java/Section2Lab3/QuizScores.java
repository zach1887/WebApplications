/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab3;

/**
 *
 * @author Jesse
 */
public class QuizScores {
    private int quiz1Score;
    private int quiz2Score;
    private int quiz3Score;
    private int quiz4Score;
    private int quiz5Score;

    public QuizScores(int quiz1Score, int quiz2Score, int quiz3Score, int quiz4Score, int quiz5Score) {
        this.quiz1Score = quiz1Score;
        this.quiz2Score = quiz2Score;
        this.quiz3Score = quiz3Score;
        this.quiz4Score = quiz4Score;
        this.quiz5Score = quiz5Score;
    }

    public int getQuiz1Score() {
        return quiz1Score;
    }

    public int getQuiz2Score() {
        return quiz2Score;
    }

    public int getQuiz3Score() {
        return quiz3Score;
    }

    public int getQuiz4Score() {
        return quiz4Score;
    }

    public int getQuiz5Score() {
        return quiz5Score;
    }
    
    
}
