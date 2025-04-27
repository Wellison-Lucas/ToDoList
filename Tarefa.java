import java.util.ArrayList;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void marcarConcluida(){
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
   public String toString() {
        return (status ? "[X] " : "[ ] ") + descricao;
    }
}
