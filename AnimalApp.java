    public class AnimalApp {
        public static void main(String[] args) {
            Cachorro dog = new Cachorro("Rex", 4, "Pastor Alemão");
            Gato cat = new Gato("Mingau", 4, "Branco");
    
            System.out.println("Informações do Cachorro: "+dog.getNome());
            dog.exibirSom();
    
            System.out.println("\nInformações do Gato: "+cat.getNome());
            cat.exibirSom();
        }
        
    }