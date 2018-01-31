package com.example.anhtuan.retrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public class Posts {

    @SerializedName("words")
    private String words;
    @SerializedName("sentence")
    private String sentence;
    @SerializedName("sentences")
    private String sentences;
    @SerializedName("paragraph")
    private String paragraph;

    public Posts() {
    }

    public String getWords() {
        return words;
    }

    public void setWorda(String words) {
        this.words = words;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentences() {
        return sentences;
    }

    public void setSentences(String sentences) {
        this.sentences = sentences;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "worda='" + words + '\'' +
                ", sentence='" + sentence + '\'' +
                ", sentences='" + sentences + '\'' +
                ", paragraph='" + paragraph + '\'' +
                '}';
    }
}
