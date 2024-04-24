package ps2.restapidb;

import javax.persistence.*;

@Entity
@Table(name = "disciplinas")
public class Disciplina {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private int codMatricula; // int

    public Disciplina() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getcodMatricula() {
        return codMatricula;
    }

    public void setcodMatricula(int codMatricula) { 
        this.codMatricula = codMatricula;
    }
}
