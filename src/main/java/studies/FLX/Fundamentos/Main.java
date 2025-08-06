package studies.FLX.Fundamentos;

import studies.FLX.Fundamentos.Interface.Bmw;
import studies.FLX.Fundamentos.Interface.Carro;
import studies.FLX.Fundamentos.Interface.Humano;
import studies.FLX.Fundamentos.Interface.SerVivo;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Bmw();

        meuCarro.acelerar();

        SerVivo meuSerVivo = new Humano();
        meuSerVivo.respirar();


        //Error

        Carro myErrorCar = null;

        try{
            myErrorCar.acelerar();

        } catch (NullPointerException exception){
            System.out.println("vender carro");
        }

    }
}
