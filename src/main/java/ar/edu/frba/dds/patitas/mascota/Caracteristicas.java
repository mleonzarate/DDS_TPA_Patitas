package ar.edu.frba.dds.patitas.mascota;

import ar.edu.frba.dds.patitas.color.Color;
import java.util.ArrayList;
import java.util.List;

public class Caracteristicas {
  private Color colorPrincipal;
  private List<Color> coloresSecundarios = new ArrayList<>();
  private boolean estaCastrado;

  public Caracteristicas(Color colorPrincipal, boolean estaCastrado) {
    this.colorPrincipal = colorPrincipal;
    this.estaCastrado = estaCastrado;
  }

  public Caracteristicas(Color colorPrincipal, List<Color> coloresSecundarios,
                         boolean estaCastrado) {
    this.colorPrincipal = colorPrincipal;
    this.coloresSecundarios = coloresSecundarios;
    this.estaCastrado = estaCastrado;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public void setColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public List<Color> getColoresSecundarios() {
    return coloresSecundarios;
  }

  public void setColoresSecundarios(List<Color> coloresSecundarios) {
    this.coloresSecundarios = coloresSecundarios;
  }

  public boolean isEstaCastrado() {
    return estaCastrado;
  }

  public void setEstaCastrado(boolean estaCastrado) {
    this.estaCastrado = estaCastrado;
  }
}
