package com.project.shopapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lesson_media")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LessonMedia {
    public static final int MAXIMUM_IMAGES_PER_PRODUCT = 6;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    @JsonIgnore
    private Lesson product;

    @Column(name = "media_url", length = 300)
    @JsonProperty("media_url")
    private String imageUrl;
}
