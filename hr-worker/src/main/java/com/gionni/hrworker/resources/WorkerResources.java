package com.gionni.hrworker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gionni.hrworker.entities.Worker;
import com.gionni.hrworker.repositories.WorkerRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

	@SuppressWarnings("unused")
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = workerRepository.findById(id).get();
		return ResponseEntity.ok(obj);
		
	}
}
