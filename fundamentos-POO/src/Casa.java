import etapaDeConstrucao.PlantaCasa;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa plantaCasa = new PlantaCasa();
        plantaCasa.metragem = 250;
        plantaCasa.material = "Alvenaria";
        plantaCasa.numeroBanheiros = 5;
        plantaCasa.numeroQuartos = 10;
        plantaCasa.cor = "Laranja";

        plantaCasa.alterarCaracteristicas(500, 2, 3, "tijolo");
        plantaCasa.construir();
        plantaCasa.pintar();
        plantaCasa.mudarCorParede("Azul");
        int metroTotal = plantaCasa.somarMetragem();
        System.out.println(metroTotal + "m2");

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.alterarCaracteristicas(250, 1, 1, "madeira");
        casaVizinho.construir();
        casaVizinho.mudarCorParede("Roxo");
        int somaMetragemCasaVizinho = casaVizinho.somarMetragem();
        System.out.println(somaMetragemCasaVizinho + "m2");
    }
}
