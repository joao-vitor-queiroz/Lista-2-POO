import java.util.ArrayList;

public class Animal {
    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> habilidades;
    static ArrayList<Long> idsAnimais = new ArrayList<>();

    public Animal(long id, String nome, int idade, double peso) {
        setId(id);
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        habilidades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (!idsAnimais.contains(id)) {
            this.id = id;
            idsAnimais.add(id);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidade) {
        habilidades.add(habilidade);
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nHabilidades: " + habilidades;
    } 
}