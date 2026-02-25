package studies.FLX.Fundamentos.Intermediario;

public class CarroAula {

    protected String modelo;
    String cor;
    int ano;
    String placa;

    void teste(){
        System.out.println("teste");
    }

    public CarroAula(String modelo, String cor, int ano, String placa){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }
}
