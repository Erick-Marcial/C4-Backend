
package com.example.Apig25.Repositorios;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Apig25.Modelos.PartidoModelo;


@Repository
public interface PartidosRepositorio extends MongoRepository<PartidoModelo, Long>{
 
  ArrayList<PartidoModelo> findByVisitante(String visitante);
  ArrayList<PartidoModelo> findByLocal(String local);
  ArrayList<PartidoModelo> findByFechapartido(String fechapartido);
  ArrayList<PartidoModelo> findByGanador(String ganador); 

}
