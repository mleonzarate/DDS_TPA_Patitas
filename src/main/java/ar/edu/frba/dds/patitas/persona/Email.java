package ar.edu.frba.dds.patitas.persona;
import org.apache.commons.validator.routines.EmailValidator;

public class Email {

  private String email;

  public Email(String email) {
    EmailValidator validador = EmailValidator.getInstance();

    if (validador.isValid(email)) {
      this.email = email;
    }
    //TODO hacer la excepcion en caso que no sea valida

  }
}
