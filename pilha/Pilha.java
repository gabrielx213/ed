package pilha;

public class Pilha {
    
    private int[] Dados;
    public int Topo;   

    public Pilha(int tam) {
        this.Dados = new int[tam+1];
        this.Topo = 0;
    }

    public boolean StackEmpty() {
        if (this.Topo == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean StackFull() {
        if (this.Topo == this.Dados.length-1) {
            return true;
        } else {
            return false;
        }
    }

    public void Push(int dado) {
        if (this.StackFull() == false){
            this.Topo += 1;
            this.Dados[this.Topo] = dado;
        }
        else {
            System.out.println("A pilha está cheia");
        }
    }

    public int Pop() throws Exception {
        if (this.StackEmpty()) {
            throw new Exception("Pilha vazia");
        } else {
            this.Topo -= 1;
            return this.Dados[this.Topo+1];
        }
    }

    public void Imprime() {
        for (int i=0; i < this.Dados.length; i++) {
            System.out.println(this.Dados[i]);
        }
    }
}
