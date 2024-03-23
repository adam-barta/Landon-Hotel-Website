package com.example.d387_sample_code.repository;


import com.example.d387_sample_code.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}