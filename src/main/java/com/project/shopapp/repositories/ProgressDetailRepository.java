package com.project.shopapp.repositories;

import com.project.shopapp.models.ProgressDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgressDetailRepository extends JpaRepository<ProgressDetail, Long> {
    List<ProgressDetail> findByOrderId(Long orderId);
}
