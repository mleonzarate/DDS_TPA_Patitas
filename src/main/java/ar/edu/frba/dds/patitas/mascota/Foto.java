package ar.edu.frba.dds.patitas.mascota;

public class Foto {
  private String nombre;
  private String base64;

  public Foto(String nombre, String base64) {
    this.nombre = nombre;
    this.base64 = base64;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getBase64() {
    return base64;
  }

  public void setBase64(String base64) {
    this.base64 = base64;
  }
}
