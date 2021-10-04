package com.gionni.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gionni.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>  {

	
}
