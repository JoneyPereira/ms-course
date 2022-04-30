package com.redua.hrworker.repositories;

import com.redua.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long>{
}
