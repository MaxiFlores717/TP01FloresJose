package fi.unju.edu.ar.model;

import org.springframework.stereotype.Component;


@Component
public class Punto3 {
  int num;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String par(){
    String resultado;
    if(num%2==0){
      resultado="es par";
    }else{
      resultado="es impar";
    }
    return resultado;
  }

}
