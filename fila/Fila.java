package fila;

public class Fila {
    private int[] Data;
    public int Head;
    public int Tail;

    public Fila(int tam) {
        this.Data = new int[tam+1]; //Uma posição a mais do que a pedida, esta não será usada
        this.Head = this.Tail = 0;
    }

    public boolean QueueEmpty() {
        if (this.Head == this.Tail) {
            return true;
        } else {
            return false;
        }
    }

    public boolean QueueFull() {
        if ((this.Tail + 1) % this.Data.length == this.Head) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int dado) throws Exception {
        if (this.QueueFull()) {
            throw new Exception("Fila cheia");
        } else {
            this.Data[this.Tail] = dado;
            if (this.Tail == this.Data.length-1) { //Contorno circular
                this.Tail = 0;
            } else {
                this.Tail++; //Caso normal
            }
        }
    }

    public int Dequeue() throws Exception {
        if (this.QueueEmpty()) {
            throw new Exception("Fila vazia");
        }
        int dado = this.Data[this.Head];
        if (this.Head == this.Data.length-1) { //Contorno circular
            this.Head = 0;
        } else {
            this.Head++;
        }
        return dado;
    }

    public void Imprime() {
        System.out.print("Head: "+this.Head);
        System.out.println("; Tail: "+this.Tail);
        System.out.print("Data:");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+",");
        }
        System.out.println("");
    }
}