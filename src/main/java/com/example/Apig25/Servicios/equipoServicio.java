package com.example.Apig25.Servicios;
import com.example.Apig25.Modelos.equipoModelo;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Apig25.Repositorios.EquipoRepositorio;

@Service
public class equipoServicio { 

  @Autowired
  EquipoRepositorio repositorio;
   
public equipoModelo guardarEquipo(equipoModelo equipo){
  return repositorio.save(equipo);
  
}
  
  public ArrayList<equipoModelo> consultarEquipos(){
    return (ArrayList<equipoModelo>)repositorio.findAll();

  }  
  
  public Optional<equipoModelo>  buscarporid(Long id){
    return repositorio.findById(id);

  }

  public boolean EliminarEquipo(long id){
    if(repositorio.existsById(id)){
        repositorio.deleteById(id);
        return true;
    }else{
        return false;
    }
  }

  public ArrayList<equipoModelo> buscarxnombreequipo(String nombreequipo){
    return repositorio.findByNombreEquipo(nombreequipo);
  }
  public ArrayList<equipoModelo> buscarxciudad(String ciudad){
    return repositorio.findByCiudad(ciudad);
  }
  
  public ArrayList<equipoModelo> buscarxpais(String pais){
    return repositorio.findByPais(pais);
  }
}
