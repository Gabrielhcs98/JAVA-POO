public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de,
            int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String no) {
        this.nome = no;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int id) {
        this.idade = id;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float al) {
        this.altura = al;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        setCategoria(peso);
    }

    private String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso < 52.2 || peso > 120.2) {
            this.categoria = "Inválido";
        } else if (peso >= 52.2 && peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso > 70.3 && peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso > 83.9) {
            this.categoria = "Pesado";
        }
        
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void apresentar(){
        System.out.println("Lutador: " + this.nome);
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " cm");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empestes: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Categoria: " + getCategoria());
    }
}
