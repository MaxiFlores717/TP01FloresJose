package fi.unju.edu.ar.model;

import org.springframework.stereotype.Component;

@Component
public class Punto2 {
  int anio;
  public void setanio(int anio) {
    this.anio = anio;
  }
  public int getanio() {
    return anio;
  }
  public String Bi(){
    String bisi="";
    if(((anio%4==0) || (anio%400==0)) && (anio%100!=0)){
      bisi="Si es Bisiesto";
    }else{
      bisi="No es bisiesto";
    }
    return bisi;
  }
}
