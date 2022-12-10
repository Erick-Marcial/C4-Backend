package com.example.Apig25.Servicios;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Apig25.Modelos.UsuarioModelo;
import com.example.Apig25.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
      return repositorio.save(usuario);


    }
  public ArrayList<UsuarioModelo> consultarUsurios(){
    return (ArrayList<UsuarioModelo>)repositorio.findAll();

  }  
  
  public Optional<UsuarioModelo>  buscarpordocumento(Long documento){
    return repositorio.findById(documento);

  }

  public boolean EliminaUsuario(long documento){
    if(repositorio.existsById(documento)){
        repositorio.deleteById(documento);
        return true;
    }else{
        return false;
    }
  }
public ArrayList<UsuarioModelo> buscarxapellido(String apellido){
  return repositorio.findByApellido(apellido);
}
public ArrayList<UsuarioModelo> buscarxgenero(String genero){
  return repositorio.findByGenero(genero);
}
public ArrayList<UsuarioModelo> buscarxnombre(String nombre){
  return repositorio.findByNombre(nombre);
}
public ArrayList<UsuarioModelo> buscarxcorreo(String correo){
  return repositorio.findByCorreo(correo);
}

}