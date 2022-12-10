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

import com.example.Apig25.Modelos.UsuarioModelo;
import com.example.Apig25.Servicios.UsuarioServicio;

@RestController
//http://localhost:8080/usuario       
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControlador {
   @Autowired
   UsuarioServicio servicio;
   //http://localhost:8080/usuario/guardar
   @PostMapping("/guardar") 
   public UsuarioModelo guardaUsuario(@RequestBody UsuarioModelo usuario){
    return servicio.guardarUsuario(usuario);
   }

   //http://localhost:8080/usuario/consultar
   @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
      return servicio.consultarUsurios();
    }
   
 //http://localhost:8080/usuario/consultardocumento
   @GetMapping("/consultardocumento/{documento}")
  public Optional<UsuarioModelo> consultaDocumento(@PathVariable("documento")Long documento){
   return servicio.buscarpordocumento(documento);
 } 

 //http://localhost:8080/usuario/eliminar
 @DeleteMapping("/eliminar/{documento}")
 public Boolean eliminar(@PathVariable("documento")Long documento){
   return servicio.EliminaUsuario(documento);
 }
 //http://localhost:8080/usuario/buscarxapellido
 @GetMapping("/buscarxapellido/{apellido}")
 public ArrayList<UsuarioModelo> buscarxapellido(@PathVariable("apellido")String apellido){
   return servicio.buscarxapellido(apellido);
 }
 //http://localhost:8080/usuario/buscarxgenero
 @GetMapping("/buscarxgenero/{genero}")
 public ArrayList<UsuarioModelo> buscarxgenero(@PathVariable("genero")String genero){
   return servicio.buscarxgenero(genero);
 }

 //http://localhost:8080/usuario/buscarxnombre
 @GetMapping("/buscarxnombre/{nombre}")
 public ArrayList<UsuarioModelo> buscarxnombre(@PathVariable("nombre")String nombre){
   return servicio.buscarxnombre(nombre);
 }

 //http://localhost:8080/usuario/buscarxcorreo
 @GetMapping("/buscarxcorreo/{correo}")
 public ArrayList<UsuarioModelo> buscarxcorreo(@PathVariable("correo")String correo){
   return servicio.buscarxcorreo(correo);
 }

} 