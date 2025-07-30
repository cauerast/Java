package studies.FLX.Fundamentos.Interface;

public class Bmw implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
    final int limiteDeVelocidade = 280;
    // final int = (const) | valor que nao vai mudar.



}
