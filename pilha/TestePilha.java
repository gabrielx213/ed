
package pilha;

public class TestePilha {

	public static void main(String[] args) {

		Pilha p = new Pilha(5);
		for (int i = 0; i<5; i++){
			try{
				p.Push(i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("A pilha ficou na forma:");
		p.Imprime();

		System.out.println("\nPassando para a fila:");
		Pilha fila = new Pilha(5);
		for (int i = 0; i<5; i++){
			try{
				int aux = p.Pop();
				fila.Push(aux);
				System.out.println(fila.Pop());
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
