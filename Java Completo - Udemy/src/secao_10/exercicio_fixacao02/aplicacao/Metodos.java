package secao_10.exercicio_fixacao02.aplicacao;

import secao_10.exercicio_fixacao02.entidades.Funcionario;

import java.util.List;

public class Metodos {
    public static boolean verificaId(int id, List<Funcionario> funcionarios){
        if(funcionarios.size() == 0){
            return true;
        }else{
            int cont = 0;
            for(Funcionario f : funcionarios){
                if(id == f.getId()){
                    cont++;
                    break;
                }
            }
            if(cont > 0){
                return false;
            }else{
                return true;
            }
        }
    }

    public static void listaFuncionarios(List<Funcionario> funcionarios){
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }
    }
}
