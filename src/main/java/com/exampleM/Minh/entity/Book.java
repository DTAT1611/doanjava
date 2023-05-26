package com.exampleM.Minh.entity;

import com.exampleM.Minh.Validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")

    private String title;
    @Column(name="author")
    private String author;
    @Column(name = "price")

    private Double price;
    @ManyToOne
    @JoinColumn(name="category_id")

    private Category category;
}