package ar.edu.frba.dds.patitas.color;

public class Color {
  private Integer red;
  private Integer green;
  private Integer blue;

  public Color(Integer red, Integer green, Integer blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }


  //Inicio Setters and Getters
  public Integer getRed() {
    return red;
  }

  public void setRed(Integer red) {
    this.red = red;
  }

  public Integer getGreen() {
    return green;
  }

  public void setGreen(Integer green) {
    this.green = green;
  }

  public Integer getBlue() {
    return blue;
  }

  public void setBlue(Integer blue) {
    this.blue = blue;
  }
  //Fin Setters and Getters
}
