package thollaus;

public class GewinnModel {
      private int gesamtPunkte;
      private int spielerZahl = 30, computerZahl = 30;
      private int rundenErgebnis;

      public GewinnModel() {

      }

      public int getSpielerZahl() {
            return spielerZahl;
      }

      public int getComputerZahl() {
            return computerZahl;
      }

      public int getRundenErgebnis() {
            return rundenErgebnis;
      }

      public void berechneComputerZahl() {
            this.computerZahl = (int) (Math.random() * 9) + 1;
      }

      public void berechneRunde(int spielerZahl){
            if(spielerZahl == computerZahl){
                  gesamtPunkte += 20;
            }else if(spielerZahl == computerZahl +1 || spielerZahl == computerZahl -1 ){
                  gesamtPunkte += 5;
            }else{
                  gesamtPunkte -= 10;
            }
      }
}

