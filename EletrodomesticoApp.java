public class EletrodomesticoApp {
    public static void main(String[] args) {
        Geladeira gela = new Geladeira("Brastemp", 120, 350);
        Microondas micro = new Microondas("Electrolux", 900, 10);

        gela.Ativar();
        micro.Ativar();
    }
}
