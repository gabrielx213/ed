package arranjo;
import java.util.concurrent.ThreadLocalRandom;

public class Arranjo<T> {

    private T[] Data;
    
    @SuppressWarnings("unchecked")
    public Arranjo(int tam) {
        this.Data = (T[]) new Object[tam];
    }

    public T Get(int i) {
        return this.Data[i];
    }

    public void Set(int i, T obj) {
        this.Data[i] = obj;
    }
    
    public void Imprime() {
        System.out.print("[");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+" ");
        }
        System.out.println("]");
    }

    public int Tam(){
        return this.Data.length;
    }

    public void a(T obj) {
        if (this.Get(this.Tam()-1) == null){
            this.Set(this.Tam()-1, obj);
        }
        this.Imprime();
    }
    
    public void b(T obj) {
        for (int i=this.Tam()-1; i > 0; i--){
            this.Set(i, this.Get(i-1)); 
        }
        this.Imprime();
        this.Set(0, obj);
        this.Imprime();
    }

    public void c(T obj){
        int aux = ThreadLocalRandom.current().nextInt(0, this.Tam());
        for (int i=this.Tam()-1; i > aux; i--){
            this.Set(i, this.Get(i-1)); 
        }
        this.Imprime();
        this.Set(aux, obj);
        this.Imprime();
    }

    public void d(T obj){
        this.Set(this.Tam()-1, obj);
        this.Imprime();
        Object ultimo = this.Get(this.Tam()-1);
        this.Set(this.Tam()-1, null);
        this.Imprime();
        System.out.println("O último dado era: " + ultimo);
    }

    public void e(){
        Object primeiro = this.Get(0);
        this.Set(0, null);
        this.Imprime();
        for (int i=0; i < this.Tam()-1; i++){
            this.Set(i, this.Get(i+1));
        }
        this.Imprime();
        System.out.println("O primeiro dado era: " + primeiro);
    }

    public void f(){
        int aux = ThreadLocalRandom.current().nextInt(0, this.Tam()-1); 
        Object dado = this.Get(aux);
        this.Set(aux, null);
        this.Imprime();
        for (int i=aux; i < this.Tam()-1; i++){
            this.Set(i, this.Get(i+1));
        }
        this.Imprime();
        System.out.println("O dado retirado foi: " + dado);
    }
}
