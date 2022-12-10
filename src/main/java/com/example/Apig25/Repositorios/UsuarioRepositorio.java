package com.example.Apig25.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Apig25.Modelos.UsuarioModelo;
@Repository
public interface UsuarioRepositorio extends MongoRepository<UsuarioModelo, Long> { 
  ArrayList<UsuarioModelo> findByApellido(String apellido);
  ArrayList<UsuarioModelo> findByGenero(String genero);
  ArrayList<UsuarioModelo> findByCorreo(String correo);
  ArrayList<UsuarioModelo> findByNombre(String nombre);
    
}