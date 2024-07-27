package com.project.shopapp.repositories;

import com.project.shopapp.models.LessonMedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<LessonMedia, Long> {
    List<LessonMedia> findByProductId(Long productId);
}
