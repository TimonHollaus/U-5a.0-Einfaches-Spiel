package thollaus;

public class GewinnController{

      public static void main(String[]args){
            GewinnModel Model = new GewinnModel();
            Model.berechneComputerZahl();
            System.out.println(Model.getComputerZahl());

            new GewinnView();

      }

}
