public class Classes extends Animal {
    private String cachorro;
    private String racas;


    public Classes(String nome, int patas, String cachorro, String racas) {
        super(nome, patas);
        this.cachorro = cachorro;
        this.racas = racas;
    }

    public String getCachorro() {
        return cachorro;
    }

    public void setCachorro(String cachorro) {
        this.cachorro = cachorro;
    }

    public String getRacas() {
        return racas;
    }

    
}
