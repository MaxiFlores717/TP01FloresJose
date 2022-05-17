package fi.unju.edu.ar.model;

import org.springframework.stereotype.Component;

@Component
public class Punto1 {
	int num;
	  public void setNum(int num) {
	    this.num = num;
	  }
	  public int getNum() {
	    return num;
	  }
	  public int main(){
	    int fact=1;
	    while(num!=0){
	      fact=fact*num;
	      num--;
	    }
	    return fact;
	  }
}
