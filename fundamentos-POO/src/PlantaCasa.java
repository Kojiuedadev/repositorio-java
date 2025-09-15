public class PlantaCasa {
    //Atributos
    int metragem, numeroQuartos, numeroBanheiros;
    String cor, material;

    public void construir(){
        System.out.println("Metragem: " + metragem + " m2");
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Número de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }
}
