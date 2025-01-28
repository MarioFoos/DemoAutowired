package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService1
{
	private MyRepository repository;

	// Inyección por método setter
	@Autowired
	public void setRepository(MyRepository repository)
	{
		this.repository = repository;
	}

	public void doOperation()
	{
		repository.save(this.getClass().getSimpleName());
	}
}



