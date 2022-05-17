package fi.unju.edu.ar.model;


public class Punto9 {
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
    for(int i=20;num>=160;num=num-i){
      aux=String.valueOf(num);
      resultado= resultado + " " + aux;
    }
    return resultado;
  }
}
