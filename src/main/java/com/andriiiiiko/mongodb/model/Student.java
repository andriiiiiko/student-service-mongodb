package com.andriiiiiko.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @MongoId
    private String id;

    private String firstName;

    private String lastName;

    @Indexed(unique = true)
    private String email;

    private Gender gender;

    private Address address;

    private List<String> favoriteSubjects;

    private BigDecimal totalSpentInBooks;

    private LocalDateTime createdAt;
}
