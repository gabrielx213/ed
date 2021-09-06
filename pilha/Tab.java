package pilha;

import java.util.Arrays;

public class Tab {

    private String[][] Casas;

    public Tab(int tam){
        this.Casas = new String[tam][];
        for (int i =0; i<tam; i++){
            this.Casas[i]= new String[tam];
        }
    }

    public int Tam(){
        return this.Casas.length;
    }

    public void Procura(){
        for(int i=0; i<this.Casas.length; i++){
            for(int j=0; j<this.Casas.length; j++){
                if(this.Casas[i][j]== null){
                    this.Set(i, j);
                }
            }
        }
    }
    public void Set(int lin, int col){
        for (int aux = 0; aux<this.Casas.length ; aux++){
            this.Casas[lin][aux] = "perigo";
            this.Casas[aux][col] = "perigo";
            if ((lin-col)+aux>=0 && (lin-col)+aux<this.Casas.length){
                this.Casas[(lin-col)+aux][aux] = "perigo";
            }
            if ((lin+col)-aux>=0 && (lin+col)-aux<this.Casas.length){
                this.Casas[(lin+col)-aux][aux] = "perigo";
            } 
        }
        this.Casas[lin][col] = "RAINHA";
        this.Procura();
    }

    public void Print(){
        for(int i = 0; i< this.Tam(); i++){
            System.out.print("     "+(i)+"  ");
        }
        for(int i = 0; i< this.Tam(); i++){
            System.out.println("\n"+(i)+" "+Arrays.toString(this.Casas[i]));
        }
    }
}