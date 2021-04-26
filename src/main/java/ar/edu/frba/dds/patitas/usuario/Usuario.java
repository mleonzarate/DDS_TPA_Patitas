package ar.edu.frba.dds.patitas.usuario;

import ar.edu.frba.dds.patitas.persona.Persona;

public class Usuario {
  private String usuario;
  private String contrasenia;
  private Persona unaPersona;
  //TODO private List<Rol> rolLista;


  public Usuario(String usuario, String contrasenia, Persona unaPersona) {
    this.usuario = usuario;
    this.contrasenia = contrasenia;
    this.unaPersona = unaPersona;
  }
}
