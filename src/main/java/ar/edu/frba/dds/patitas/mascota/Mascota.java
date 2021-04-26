package ar.edu.frba.dds.patitas.mascota;

import java.util.List;

public class Mascota {
  private TipoMascota tipoMascota;
  private String nombre;
  private String apodo;
  private Integer edad;
  private String sexo;
  private String descripcion;
  private List<Foto> fotos;
  private List<Caracteristicas> caracteristicas;
  private String codigoQR;

  //Constructor
  public Mascota(TipoMascota tipoMascota, String nombre, String apodo,
                 Integer edad, String sexo, String descripcion, List<Foto> fotos,
                 List<Caracteristicas> caracteristicas) {

    this.tipoMascota = tipoMascota;
    this.nombre = nombre;
    this.apodo = apodo;
    this.edad = edad;
    this.sexo = sexo;
    this.descripcion = descripcion;
    this.fotos = fotos;
    this.caracteristicas = caracteristicas;
  }

  public void agregarCaracteristica(Caracteristicas unaCaracteristica) {
    this.caracteristicas.add(unaCaracteristica);
  }

  public void agregarFoto(Foto unaFoto){
    this.fotos.add(unaFoto);
  }

  //Inicio Setters and Getters
  public TipoMascota getTipoMascota() {
    return tipoMascota;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApodo() {
    return apodo;
  }

  public Integer getEdad() {
    return edad;
  }

  public String getSexo() {
    return sexo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public List<Foto> getFotos() {
    return fotos;
  }

  public List<Caracteristicas> getCaracteristicas() {
    return caracteristicas;
  }

  public String getCodigoQR() {
    return codigoQR;
  }

  public void setTipoMascota(TipoMascota tipoMascota) {
    this.tipoMascota = tipoMascota;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApodo(String apodo) {
    this.apodo = apodo;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setCodigoQR(String codigoQR) {
    this.codigoQR = codigoQR;
  }
  //Fin Setters and Getters


}