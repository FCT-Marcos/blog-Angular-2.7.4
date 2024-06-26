package com.marcos.blog.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Post {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
