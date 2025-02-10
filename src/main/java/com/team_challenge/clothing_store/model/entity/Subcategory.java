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
@Table(name = "subcategories")
public class Subcategory {
    private final String SEQ_NAME = "subcategory_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "subcategory")
    private List<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;
    @CreationTimestamp
    private LocalDateTime dateOfCreated;

//    @PrePersist
//    private void init() {
//        dateOfCreated = LocalDateTime.now();
//    }


}
