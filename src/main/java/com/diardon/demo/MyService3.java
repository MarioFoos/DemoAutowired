package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService3
{
	// Inyección por campo
    @Autowired
    private MyRepository repository;

	public void doOperation()
	{
		repository.save(this.getClass().getSimpleName());
	}
}

