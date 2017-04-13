package cdp;

import java.util.Date;
import java.util.LinkedList;

public class Produtor extends Pessoa{
    
    private String inscricao_estadual;
    private LinkedList<Propriedade> propriedades;

    public Produtor(String inscricao_estadual, String nome, Date dt_nasc, String cpf, String rg, char sexo, String telefone, LinkedList<Propriedade> propriedades) {
        super(nome, dt_nasc, cpf, rg, sexo, telefone);
        this.inscricao_estadual = inscricao_estadual;
        this.propriedades = propriedades;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public LinkedList<Propriedade> getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(LinkedList<Propriedade> propriedades) {
        this.propriedades = propriedades;
    }
}
