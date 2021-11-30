package com.example.Example.services;

import java.util.List;

import com.example.Example.Classes.Alumno;

public interface IAlumnoService {
	public List<Alumno> findAll();
	public void save(Alumno alumno);
	public Alumno findOne(Long id);
	public void delete(Long id);
}
