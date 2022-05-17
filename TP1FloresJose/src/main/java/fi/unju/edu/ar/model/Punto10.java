package fi.unju.edu.ar.model;


public class Punto10 {
  int num;
  String aux;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String secu(){
    String resultado="";
    while(num>=160){
      aux=String.valueOf(num);
      resultado= resultado + " " + aux;
      num=num-20;
    }
    return resultado;
  }
}
