package ejercicios.modulo4.library;

import java.time.LocalDate;

public class Material{
    private  String title;
    private  String author;
    private  String topic;
    private  LocalDate datePublished;

    public Material(String title, String author, LocalDate datePublished, String topic) {
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic){
        this.topic=topic;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished){
        this.datePublished=datePublished;
    }


    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Date Published: " + datePublished);
        System.out.println("Topic: " + topic);
    }
}
