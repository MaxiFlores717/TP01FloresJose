package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fi.unju.edu.ar.controller.*;
import fi.unju.edu.ar.model.Punto1;
import fi.unju.edu.ar.model.Punto10;
import fi.unju.edu.ar.model.Punto11;
import fi.unju.edu.ar.model.Punto12;
import fi.unju.edu.ar.model.Punto2;
import fi.unju.edu.ar.model.Punto3;
import fi.unju.edu.ar.model.Punto4;
import fi.unju.edu.ar.model.Punto5;
import fi.unju.edu.ar.model.Punto6;
import fi.unju.edu.ar.model.Punto7;
import fi.unju.edu.ar.model.Punto8;
import fi.unju.edu.ar.model.Punto9;
@Controller
public class PuntosController {
	  @GetMapping("/menu")
	  public String GetMenu(){
	    return "menu";
	  }
	  //punto1
	  @GetMapping("/punto1")
	  public String getPotenciapage(@RequestParam (name = "num") int num, Model model){
	    int Factorial=1;
	    Punto1 factoPrincipal = new Punto1();
	    factoPrincipal.setNum(num);
	    Factorial= factoPrincipal.main();
	    model.addAttribute("Factorial", Factorial);
	    return "Punto1";
	  }
	  @GetMapping("/punto2")
	  public String getBiPage(@RequestParam (name = "num") int num, Model model){
	    String ABisiesto;
	    Punto2 biBisiesto = new Punto2();
	    biBisiesto.setanio(num);
	    ABisiesto = biBisiesto.Bi();
	    model.addAttribute("ABisiesto", ABisiesto);
	    return "Punto2";
	  }
	
	  @GetMapping("/punto3")
	  public String getparPage(@RequestParam (name = "num") int num,Model model){
	    String[] Aux1= new String[5];
	    Punto3 ppar = new Punto3();
			for(int i=0;i<5;i++){
				ppar.setNum(num);
				Aux1[i] = ppar.par();
	      model.addAttribute("par1", Aux1[0]);
	      model.addAttribute("par2", Aux1[1]);
	      model.addAttribute("par3", Aux1[2]);
	      model.addAttribute("par4", Aux1[3]);
	      model.addAttribute("par5", Aux1[4]);
				num=num+3;
			}
	    return "Punto3";
	  }

	  @GetMapping("/punto4")
	  public String getmesPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Punto4 mmes = new Punto4();
	    mmes.setNum(num);
			aux = mmes.ME();
	    model.addAttribute("me", aux);
	    return "Punto4";
	  }
	  
	  @GetMapping("/punto5")
	  public String getmes2Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Punto5 mmes2 = new Punto5();
	    mmes2.setNum(num);
			aux = mmes2.ME();
	    model.addAttribute("me2", aux);
	    return "Punto5";
	  }

	  @GetMapping("/punto6")
	  public String getnotaPage(@RequestParam (name = "num") int num,Model model){
	    String[] Aux1= new String[8];
	    Punto6 nnota = new Punto6();
			for(int i=0;i<8;i++){
				nnota.setNum(num);
				Aux1[i] = nnota.nota();
	      model.addAttribute("nota1", Aux1[0]);
	      model.addAttribute("nota2", Aux1[1]);
	      model.addAttribute("nota3", Aux1[2]);
	      model.addAttribute("nota4", Aux1[3]);
	      model.addAttribute("nota5", Aux1[4]);
	      model.addAttribute("nota6", Aux1[5]);
	      model.addAttribute("nota7", Aux1[6]);
	      model.addAttribute("nota8", Aux1[7]);
				num--;
			}
	    return "Punto6";
	  }

	  @GetMapping("/punto7")
	  public String getsecuPage(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Punto7 secu = new Punto7();
	    secu.setNum(num);
	    Aux = secu.secu();
	    model.addAttribute("secu", Aux);
	    return "Punto7";
	  }

	  @GetMapping("/punto8")
	  public String getsecu2Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Punto8 secu2 = new Punto8();
	    secu2.setNum(num);
	    Aux = secu2.secu();
	    model.addAttribute("secu2", Aux);
	    return "Punto8";
	  }

	  @GetMapping("/punto9")
	  public String getsecu3Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Punto9 secu3 = new Punto9();
	    secu3.setNum(num);
	    Aux = secu3.secu();
	    model.addAttribute("secu3", Aux);
	    return "Punto9";
	  }

	  @GetMapping("/punto10")
	  public String getsecu4Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Punto10 secu4 = new Punto10();
	    secu4.setNum(num);
	    Aux = secu4.secu();
	    model.addAttribute("secu4", Aux);
	    return "Punto10";
	  }

	  @GetMapping("/punto11")
	  public String getsecu5Page(@RequestParam (name = "num") int num, Model model){
	    String Aux;
	    Punto11 secu5 = new Punto11();
	    secu5.setNum(num);
	    Aux = secu5.secu();
	    model.addAttribute("secu5", Aux);
	    return "Punto11";
	  }

	  @GetMapping("/punto12")
	  public String gettiempoPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Punto12 tiem = new Punto12();
	    tiem.setNum(num);
	    aux = tiem.formula();
	    model.addAttribute("tempo", aux);
	    return "Punto12";
	  }
}
