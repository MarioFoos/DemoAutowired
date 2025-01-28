package com.diardon.demo;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository
{
    public void save(String src)
    {
        System.out.println("Guardando en el repositorio. Desde " + src);
    }
}
