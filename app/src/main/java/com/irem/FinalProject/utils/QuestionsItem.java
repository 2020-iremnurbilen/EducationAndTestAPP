package com.irem.FinalProject.utils;

public class QuestionsItem {

    String questions, answer1, answer2, answer3, asnwer4, correct;

    public QuestionsItem(String questions, String answer1, String answer2, String answer3, String asnwer4, String correct) {
        this.questions = questions;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.asnwer4 = asnwer4;
        this.correct = correct;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAsnwer4() {
        return asnwer4;
    }

    public void setAsnwer4(String asnwer4) {
        this.asnwer4 = asnwer4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}
