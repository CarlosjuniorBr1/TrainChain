package com.trainchain.repository;

import com.trainchain.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository <Train, Long> {
}
