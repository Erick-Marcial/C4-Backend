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
//https://backend-appdeportiva-production.up.railway.app/usuario       
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControlador {
   @Autowired
   UsuarioServicio servicio;
   //https://backend-appdeportiva-production.up.railway.app/usuario/guardar
   @PostMapping("/guardar") 
   public UsuarioModelo guardaUsuario(@RequestBody UsuarioModelo usuario){
    return servicio.guardarUsuario(usuario);
   }

   //https://backend-appdeportiva-production.up.railway.app/usuario/consultar
   @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
      return servicio.consultarUsurios();
    }
   
 //https://backend-appdeportiva-production.up.railway.app/usuario/consultardocumento
   @GetMapping("/consultardocumento/{documento}")
  public Optional<UsuarioModelo> consultaDocumento(@PathVariable("documento")Long documento){
   return servicio.buscarpordocumento(documento);
 } 

 //https://backend-appdeportiva-production.up.railway.app/usuario/eliminar
 @DeleteMapping("/eliminar/{documento}")
 public Boolean eliminar(@PathVariable("documento")Long documento){
   return servicio.EliminaUsuario(documento);
 }
 //https://backend-appdeportiva-production.up.railway.app/usuario/buscarxapellido
 @GetMapping("/buscarxapellido/{apellido}")
 public ArrayList<UsuarioModelo> buscarxapellido(@PathVariable("apellido")String apellido){
   return servicio.buscarxapellido(apellido);
 }
 //https://backend-appdeportiva-production.up.railway.app/usuario/buscarxgenero
 @GetMapping("/buscarxgenero/{genero}")
 public ArrayList<UsuarioModelo> buscarxgenero(@PathVariable("genero")String genero){
   return servicio.buscarxgenero(genero);
 }

 //https://backend-appdeportiva-production.up.railway.app/usuario/buscarxnombre
 @GetMapping("/buscarxnombre/{nombre}")
 public ArrayList<UsuarioModelo> buscarxnombre(@PathVariable("nombre")String nombre){
   return servicio.buscarxnombre(nombre);
 }

 //https://backend-appdeportiva-production.up.railway.app/usuario/buscarxcorreo
 @GetMapping("/buscarxcorreo/{correo}")
 public ArrayList<UsuarioModelo> buscarxcorreo(@PathVariable("correo")String correo){
   return servicio.buscarxcorreo(correo);
 }

} 