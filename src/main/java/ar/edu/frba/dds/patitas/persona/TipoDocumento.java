package ar.edu.frba.dds.patitas.persona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum TipoDocumento {
  DNI("regex"),
  CEDULA("REGEX"),
  PASAPORTE("REGEX");

  private String regex;
  TipoDocumento(String regex){
    this.regex = regex;
  }

  public void validar(String indentificador) throws Exception {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(indentificador);
    if(!matcher.matches())
      throw new Exception("El indentificador ingresado no es valido");
  }
}
