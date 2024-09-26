package com.ren.Books1;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Books1 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bookId; //primary key

  @Column(name = "title")
  private String title;

  @Column(name = "year")
  private Year year;

  @Column(name = "author")
  private String author;

  @Column(name = "rating")
  private double rating;

  // Constructors, getters and setters

  public Books1() {}

  public Books1(String title, Year year, String author, double rating){
    this.title=title;
    this.year=year;
    this.author=author;
    this.rating=rating;
  }

  public Long getId(){
    return bookId;
  }
}