package com.example.d387_sample_code.convertor;

import com.example.d387_sample_code.entity.ReservationEntity;

import java.util.List;


public interface ReservationService {
    public ReservationEntity findLast();
    public List<ReservationEntity> findAll();
}
