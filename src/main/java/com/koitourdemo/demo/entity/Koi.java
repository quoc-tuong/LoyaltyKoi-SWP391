package com.koitourdemo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@Table(name = "KoiList")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Koi {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    UUID id;

    @JsonIgnore
    boolean isDeleted = false;

    @NotBlank(message = "Koi name cannot be blank!")
    String name;

    @NotBlank(message = "Koi color cannot be blank!")
    String color;

    @NotBlank(message = "Koi weight cannot be blank!")
    String weight;

    @NotBlank(message = "Koi size cannot be blank!")
    String size;

    @NotBlank(message = "Koi origin cannot be blank!")
    String origin;

    String description;
    String image;
    float price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
