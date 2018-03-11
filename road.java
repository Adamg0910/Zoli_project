/**
 * valami gáz van nem fut le az appod, mi lehet a baj?
 */


package zoli_projekt;

public class road extends auto {


    public static void main (String[] args) {
     cars bmw = new cars();
     
     bmw.setMakeBreak = "hard right now";
     bmw.setDoGas(120);
     
     cars seat = new auto();
     seat.setDoGas(110);
     seat.makeBreak = "gently";
     
    System.out.println(seat.doGas);
    System.out.println(bmw.makeBreak);
      
}
  
}
