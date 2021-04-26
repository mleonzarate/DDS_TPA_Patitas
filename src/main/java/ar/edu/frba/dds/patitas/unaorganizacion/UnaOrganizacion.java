package ar.edu.frba.dds.patitas.unaorganizacion;

import ar.edu.frba.dds.patitas.color.Color;
import ar.edu.frba.dds.patitas.mascota.Caracteristicas;
import ar.edu.frba.dds.patitas.mascota.Foto;
import ar.edu.frba.dds.patitas.persona.Persona;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.ArrayList;
import java.util.List;

public class UnaOrganizacion {

  public static class EmailValidation {
    public static boolean isValidEmail(String email) {
      // create the EmailValidator instance
      EmailValidator validator = EmailValidator.getInstance();

      // check for valid email addresses using isValid method
      return validator.isValid(email);
    }
  }

  public static void main( String[] args) {

   /* Color unColor = new Color(100,100,100);
    Caracteristicas unaCaracteristica = new Caracteristicas(unColor,true);
    Foto unaFoto = new Foto("Foto1","una cadena");
    List<Foto> unaFotoLista = new ArrayList<>();
    unaFotoLista.add(unaFoto);*/

    EmailValidator validator = EmailValidator.getInstance();


    System.out.println("**** Comienzo Prueba ****");

    if ( validator.isValid("unmail@gmailcom") ){
      System.out.println("es valido\n");
    }
    else{
      System.out.println("no es valido\n");
    }

    System.out.println("**** Fin Prueba ****");
  }

}
