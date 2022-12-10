package com.example.Apig25.Repositorios;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Apig25.Modelos.equipoModelo;

@Repository
public interface EquipoRepositorio extends MongoRepository<equipoModelo, Long>{
 
  ArrayList<equipoModelo> findByNombreEquipo(String nombreEquipo);
  ArrayList<equipoModelo> findByCiudad(String ciudad);
  ArrayList<equipoModelo> findByPais(String pais);
 

}
