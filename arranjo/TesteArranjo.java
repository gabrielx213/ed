package arranjo;
import java.util.concurrent.TimeUnit;

public class TesteArranjo {
    public static void main(String[] args) throws InterruptedException {

		Arranjo<String> arr1 = new Arranjo<String>(5);
        Arranjo<String> arr2 = new Arranjo<String>(5);
        Arranjo<String> arr3 = new Arranjo<String>(5);
        Arranjo<String> arr4 = new Arranjo<String>(5);
        Arranjo<String> arr5 = new Arranjo<String>(5);
        Arranjo<String> arr6 = new Arranjo<String>(5);
        for(int i = 0; i<4; i++){
            arr1.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
            arr2.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
            arr3.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
            arr4.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
            arr5.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
            arr6.Set(i, String.valueOf(RandomCharacter.getRandomLowerCaseLetter()));
        }
        arr1.Imprime();
        arr2.Imprime();
        arr3.Imprime();
        arr4.Imprime();
        arr5.Imprime();
        arr6.Imprime();
        System.out.println("Operando com as alternativas para cada arranjo:\n\n\n\n\n");
        TimeUnit.SECONDS.sleep(3);
        /** Letra a */
        System.out.println("\nLetra a:");
        arr1.Imprime();
        arr1.a("n");
        TimeUnit.SECONDS.sleep(3);
        /** Letra b */
        System.out.println("\nLetra b:");
        arr2.Imprime();
        arr2.b("o");
        TimeUnit.SECONDS.sleep(3);
        /** Letra c */
        System.out.println("\nLetra c:");
        arr3.Imprime();
        arr3.c("p");
        TimeUnit.SECONDS.sleep(3);
        /** Letra d */
        System.out.println("\nLetra d:");
        arr4.Imprime();
        arr4.d("q");
        TimeUnit.SECONDS.sleep(3);
        /** Letra e */
        System.out.println("\nLetra e:");
        arr5.Imprime();
        arr5.e();
        TimeUnit.SECONDS.sleep(3);
        /** Letra f */
        System.out.println("\nLetra f:");
        arr6.Imprime();
        arr6.f();
	}   
}
