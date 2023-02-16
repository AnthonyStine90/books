package com.anthony.books.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "books")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String description;

  private String language;

  private Integer numberOfPages;



  // empty constructor needed to be a java bean
  public Book() {
  }

  public Book(String title, String desc, String lang, int pages) {
    this.title = title;
    this.description = desc;
    this.language = lang;
    this.numberOfPages = pages;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getNumberOfPages() {
    return this.numberOfPages;
  }

  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }



  // annotations that help us keep track of created/updated objects without having to write it many times
  // @PrePersist
  // protected void onCreate() {
  //   this.createdAt = new Date();
  // }

  // @PreUpdate
  // protected void onUpdate() {
  //   this.updatedAt = new Date();
  // }


}
