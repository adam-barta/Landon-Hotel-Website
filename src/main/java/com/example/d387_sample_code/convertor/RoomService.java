package com.example.d387_sample_code.convertor;

import com.example.d387_sample_code.entity.RoomEntity;

import java.util.List;


public interface RoomService {

    public RoomEntity findById(long theId);
   // public Page<RoomEntity> findAvailableRooms(LocalDate checkin, LocalDate checkout, Pageable page);
    public List<RoomEntity> findAll();

}
