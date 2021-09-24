package heap;

public class MinHeap {
    
    private int size;
    private int maxSize;
    private int H[];
    
    public MinHeap(int max) {
        this.maxSize = max;     //tamanho max
        this.size = 0;          //tamanho atual
        this.H = new int[max];  //arranjo do heap
    }

    public int Parent(int i) {
        return (int) Math.floor((i-1)/2); //floor(i/2) para arranjo começando em 1
    }

    public int LeftChild(int i) {
        return 2*i + 1; //2i para arranjo começando em 1
    }

    public int RightChild(int i) {
        return 2*i + 2; //2i+2 para arranjo começando em 1
    }
    
    public void Insert (int p) throws Exception {
        if (this.size == maxSize) {
            throw new Exception("heap cheia");
        }
        H[this.size] = p;
        this.size++;
        ChangeUp(size-1);
    }

    public void Swap(int i, int j) {
        int tmp = H[i];
        H[i] = H[j];
        H[j] = tmp;
    }
    
    public void ChangeUp(int i) {
        if (i>0 && H[Parent(i)]>H[i]) {
            Swap(i,Parent(i));
            ChangeUp(Parent(i));
        }
    }
    
    public void ChangeDown(int i) {
        if(H[i] < H[LeftChild(i)] || H[i] < H[RightChild(i)]){
            if(H[LeftChild(i)] < H[RightChild(i)]){
                Swap(i,LeftChild(i));
                ChangeDown(LeftChild(i));
            }
            else{
                Swap(i,RightChild(i));
                ChangeDown(RightChild(i));
            }
        }
    }

    public int GetMin(){
        if(size>0){
            return H[0];
        }
        else{
            return -1;
        }
    }

    public void Remove(int i){
        
    }

}