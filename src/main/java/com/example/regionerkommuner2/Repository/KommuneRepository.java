package com.example.regionerkommuner2.repository;

import com.example.regionerkommuner2.Model.Kommune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KommuneRepository extends JpaRepository<Kommune, String> {
}