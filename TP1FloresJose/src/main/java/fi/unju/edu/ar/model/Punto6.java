package fi.unju.edu.ar.model;


public class Punto6 {
  int num;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String nota(){
    String resultado;
    if(num==6){
      resultado="Alumno regulariza";
    }else{
      if(num>=7 && num<=10){
        resultado="El alumno promociona";
      }else{
        if(num<6 && num>=1){
          resultado ="El alumno desaprueba";
        }else{
            resultado="valor no permitido";
        }
      }
    }
    return resultado;
  }

}
