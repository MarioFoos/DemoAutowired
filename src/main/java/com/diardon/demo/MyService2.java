package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService2
{
    private final MyRepository repository;

    // Inyección por constructor
    @Autowired
    public MyService2(MyRepository repository)
    {
        this.repository = repository;
    }
	public void doOperation()
	{
		repository.save(this.getClass().getSimpleName());
	}
}
