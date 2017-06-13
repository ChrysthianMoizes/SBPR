package cgt.util;

public class SBPRException extends Exception {

    int codErro;
    String [] msgsErro;

    public SBPRException(int cod) {
        
        super("SBPR erro genérico.");
        msgsErro = new String[500];
        this.codErro = cod;

        msgsErro[0] = "Código de erro inválido!";
        
        // Produtor:
        msgsErro[1] = "Campo NOME inválido";
        msgsErro[2] = "Campo CPF inválido";
        msgsErro[3] = "Campo DATA inválido";
        msgsErro[4] = "Campo RG inválido";  
        msgsErro[5] = "Campo TELEFONE inválido";  
        msgsErro[6] = "Campo INSCRIÇÃO ESTADUAL inválido";    
        
        //Tipo de Serviço 7 - 20
        msgsErro[7] = "Campo valor do tipo de serviço inválido"; 
        msgsErro[8] = "Tipo de Serviço vinculado a Serviço(s)!";
        
        //Cargo
        msgsErro[20] = "Campo NOME DO CARGO inválido";
        
        //Serviço 50 - 100
        msgsErro[50] = "Propriedade vinculada a Serviço(s)!";
        msgsErro[51] = "Todas as máquinas estão agendadas para essa data!";
        msgsErro[52] = "Valor da multa inválido!";
        msgsErro[53] = "Valor total inválido!";
        
    }
    
    @Override
    public String getMessage() {        
        return msgsErro[codErro];
    }  
}
