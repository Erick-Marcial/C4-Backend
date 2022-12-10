package com.example.Apig25.Servicios;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Apig25.Modelos.PartidoModelo;
import com.example.Apig25.Repositorios.PartidosRepositorio;

@Service
public class partidosServicio {
   @Autowired
    PartidosRepositorio repositorio;
   
public PartidoModelo guardarPartido(PartidoModelo partido){
  return repositorio.save(partido);
  
}
  
  public ArrayList<PartidoModelo> consultarPartido(){
    return (ArrayList<PartidoModelo>)repositorio.findAll();

  }  
  
  public Optional<PartidoModelo>  buscarporid(Long id){
    return repositorio.findById(id);

  }

  public boolean EliminaPartido(long id){
    if(repositorio.existsById(id)){
        repositorio.deleteById(id);
        return true;
    }else{
        return false;
    }
  }
public ArrayList<PartidoModelo> buscarxlocal(String local){
  return repositorio.findByLocal(local);
}
public ArrayList<PartidoModelo> buscarxvisitante(String visitante){
  return repositorio.findByVisitante(visitante);
}

public ArrayList<PartidoModelo> buscarxfechapartido(String fechapartido){
  return repositorio.findByFechapartido(fechapartido);
}
public ArrayList<PartidoModelo> buscarxganador(String ganador){
  return repositorio.findByGanador(ganador);
}

}