package com.team_challenge.clothing_store.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category {
    private final String SEQ_NAME = "category_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "category")
    private List<Subcategory> subcategories;
    @CreationTimestamp
    private LocalDateTime dateOfCreated;

//    @PrePersist
//    private void init() {
//        dateOfCreated = LocalDateTime.now();
//    }
}
