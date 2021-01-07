package ru.job4j.inheritance;

public class SubjectOfStudy {
    private String detailDrawing;
    private String accessories;
    private String example;
    private String numerals;
    private String theorem;
    private String prose;
    private String poetry;
    private String biography;
    private String essay;

    public SubjectOfStudy() {
    }

    public SubjectOfStudy(String detailDrawing, String accessories, String example, String numerals, String theorem, String prose, String poetry, String biography, String essay) {
        this.detailDrawing = detailDrawing;
        this.accessories = accessories;
        this.example = example;
        this.numerals = numerals;
        this.theorem = theorem;
        this.prose = prose;
        this.poetry = poetry;
        this.biography = biography;
        this.essay = essay;
    }

    public String getDetailDrawing() {
        return detailDrawing;
    }

    public void setDetailDrawing(String detailDrawing) {
        this.detailDrawing = detailDrawing;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getNumerals() {
        return numerals;
    }

    public void setNumerals(String numerals) {
        this.numerals = numerals;
    }

    public String getTheorem() {
        return theorem;
    }

    public void setTheorem(String theorem) {
        this.theorem = theorem;
    }

    public String getProse() {
        return prose;
    }

    public void setProse(String prose) {
        this.prose = prose;
    }

    public String getPoetry() {
        return poetry;
    }

    public void setPoetry(String poetry) {
        this.poetry = poetry;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }
}
