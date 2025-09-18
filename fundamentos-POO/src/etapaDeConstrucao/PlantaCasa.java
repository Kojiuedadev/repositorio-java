package etapaDeConstrucao;

public class PlantaCasa {
    //Atributos
    public int metragem, numeroQuartos, numeroBanheiros;
    public String cor, material;

    public void construir(){
        System.out.println("Casa contruida com sucesso!");
        System.out.println("Metragem: " + metragem + " m2");
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Número de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
    }

    public int somarMetragem(){
        return  metragem * numeroBanheiros + numeroQuartos;

    }
}
