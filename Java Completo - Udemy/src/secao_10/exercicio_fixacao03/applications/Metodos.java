package secao_10.exercicio_fixacao03.applications;

public class Metodos {
    public static boolean verificaNumero(int numero, int[][] matriz){
        if(matriz.length == 0){
            return false;
        }else{
            int cont = 0;
            for(int l = 0; l < matriz.length; l++){
                for(int c = 0; c < matriz[l].length; c++){
                    if(matriz[l][c] == numero){
                        cont++;
                        break;
                    }
                    }
                }
            if(cont == 0){
                return false;
            }else {
                return true;
            }
        }
    }

}
