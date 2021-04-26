package ar.edu.frba.dds.patitas.persona;

import ar.edu.frba.dds.patitas.mascota.Mascota;
import java.util.ArrayList;
import java.time.*;
import java.util.List;


public class Persona {
  private String nombre;
  private String apellido;
  private LocalDate fechaNacimiento; //tipo Date
  private TipoDocumento tipoDocumento;
  private String nroDocumento;
  private List<Contacto> contactos = new ArrayList<>();
  private List<Mascota> mascotas = new ArrayList<>();

  public Persona(String nombre, String apellido, LocalDate fechaNacimiento,
                 TipoDocumento tipoDocumento, String nroDocumento, Contacto unContacto,
                 Mascota unaMascota) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.tipoDocumento = tipoDocumento;
    this.nroDocumento = nroDocumento;
    this.contactos.add(unContacto);
    this.mascotas.add(unaMascota);
  }

  public void agregarContacto(Contacto unContacto) {
    this.contactos.add(unContacto);
  }


  //Inicio Setters and Getters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public String getNroDocumento() {
    return nroDocumento;
  }

  public void setNroDocumento(String nroDocumento) {
    this.nroDocumento = nroDocumento;
  }

  //Fin Setters and Getters

}
