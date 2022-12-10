package com.example.Apig25.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Apig25.Modelos.equipoModelo;
import com.example.Apig25.Servicios.equipoServicio;

@RestController
//https://backend-appdeportiva-production.up.railway.app/equipo
@RequestMapping("/equipo")
@CrossOrigin("*")

public class EquipoControlador {
@Autowired
equipoServicio servicio;
//https://backend-appdeportiva-production.up.railway.app/equipo/guardar
@PostMapping("/guardar")
public equipoModelo guardaequipo(@RequestBody equipoModelo equipo){
    return servicio.guardarEquipo(equipo);
}

//https://backend-appdeportiva-production.up.railway.app/equipo/consultarid
@GetMapping("/consultarid/{id}")
public Optional<equipoModelo> consultaid(@PathVariable("id")Long id){
 return servicio.buscarporid(id);
}

//https://backend-appdeportiva-production.up.railway.app/equipo/consultar
@GetMapping("/consultar")
public ArrayList<equipoModelo> consultaEquipos(){
    return servicio.consultarEquipos();
}
//https://backend-appdeportiva-production.up.railway.app/equipo/buscarxequipo
@GetMapping("/buscarxequipo/{nombreEquipo}")
public ArrayList<equipoModelo> buscarxequipo(@PathVariable("nombreEquipo")String nombreEquipo){
  return servicio.buscarxnombreequipo(nombreEquipo);
}
 //https://backend-appdeportiva-production.up.railway.app/equipo/eliminar
 @DeleteMapping ("/eliminar/{id}")
 public Boolean eliminar(@PathVariable("id")Long id){
   return servicio.EliminarEquipo(id);
 }   

  //https://backend-appdeportiva-production.up.railway.app/equipo/buscarxciudad
  @GetMapping("/buscarxciudad/{ciudad}")
  public ArrayList<equipoModelo> buscarxciudad(@PathVariable("ciudad")String ciudad){
    return servicio.buscarxciudad(ciudad);
  }

   //https://backend-appdeportiva-production.up.railway.app/equipo/buscarxpais
   @GetMapping("/buscarxpais/{pais}")
   public ArrayList<equipoModelo> buscarxpais(@PathVariable("pais")String pais){
     return servicio.buscarxpais(pais);
   }
}
