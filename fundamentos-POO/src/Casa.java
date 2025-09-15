public class Casa {
    public static void main(String[] args) {
        PlantaCasa plantaCasa = new PlantaCasa();
        plantaCasa.metragem = 250;
        plantaCasa.material = "Alvenaria";
        plantaCasa.numeroBanheiros = 2;
        plantaCasa.numeroQuartos = 3;
        plantaCasa.cor = "Laranja";

        plantaCasa.construir();
        plantaCasa.pintar();
    }
}
