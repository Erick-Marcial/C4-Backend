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

import com.example.Apig25.Modelos.PartidoModelo;
import com.example.Apig25.Servicios.partidosServicio;

@RestController
//http://localhost:8080/partido       
@RequestMapping("/partido")
@CrossOrigin("*")
public class PartidosControlador {
   @Autowired
   partidosServicio servicio;
   //http://localhost:8080/partido/guardar
   @PostMapping("/guardar") 
   public PartidoModelo guardaPartido(@RequestBody PartidoModelo partido){
    return servicio.guardarPartido(partido);
   }

   //http://localhost:8080/partido/consultar
   @GetMapping("/consultar")
    public ArrayList<PartidoModelo> consultaPartido(){
      return servicio.consultarPartido();
    }
   
 //http://localhost:8080/partido/consultarid
   @GetMapping("/consultarid/{id}")
  public Optional<PartidoModelo> consultaid(@PathVariable("id")Long id){
   return servicio.buscarporid(id);
 } 

 //http://localhost:8080/partido/eliminar
 @DeleteMapping("/eliminar/{id}")
 public Boolean eliminar(@PathVariable("id")Long id){
   return servicio.EliminaPartido(id);
 }
 //http://localhost:8080/partido/buscarxlocal
 @GetMapping("/buscarxlocal/{local}")
 public ArrayList<PartidoModelo> buscarxlocal(@PathVariable("local")String local){
   return servicio.buscarxlocal(local);
 }
 @GetMapping("/buscarxvisitante/{visitante}")
 public ArrayList<PartidoModelo> buscarxvisitante(@PathVariable("visitante")String visitante){
   return servicio.buscarxvisitante(visitante);
 }
 @GetMapping("/buscarxfecha/{fechapartido}")
 public ArrayList<PartidoModelo> buscarxfechapartido(@PathVariable("fechapartido")String fechapartido){
   return servicio.buscarxfechapartido(fechapartido);
 }
 @GetMapping("/buscarxganador/{ganador}")
 public ArrayList<PartidoModelo> buscarxganador(@PathVariable("ganador")String ganador){
   return servicio.buscarxganador(ganador);
 }

} 
