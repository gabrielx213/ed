package fila;

public class TesteFila {

    public static void main(String[] args) {

		Fila f = new Fila(3);
        try {
            f.Enqueue(10);
            f.Enqueue(15);
            f.Enqueue(20);
            f.Imprime();
            System.out.println(f.QueueFull());
        } catch (Exception e) {
            System.out.println(e); 
        }
        try {
            System.out.println(f.Dequeue());
            System.out.println(f.Dequeue());
            System.out.println(f.QueueEmpty());
            System.out.println(f.Dequeue());
            System.out.println(f.QueueEmpty());
            f.Imprime();    
        } catch (Exception e) {
            System.out.println(e); 
        }
        try {
            f.Enqueue(25);
            f.Enqueue(30);
            f.Enqueue(35);
            System.out.println(f.QueueFull());
            f.Imprime();
        } catch (Exception e) {
            System.out.println(e); 
        }
        
	}
    
}