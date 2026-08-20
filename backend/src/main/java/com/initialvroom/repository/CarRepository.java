package com.initialvroom.repository;

import com.initialvroom.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data auto-implements this interface — no code needed for findAll, findById, save, etc.
 * The generic <Car, String> means: Car entity, String type for the @Id field.
 */
public interface CarRepository extends JpaRepository<Car, String> {

    // Spring generates the query from the method name: WHERE stage_id = ?
    // Used by GET /api/cars?stageId=Stage 1
    List<Car> findByStageId(String stageId);
}
