package hash;

import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class atv7 {

  public static void main (String args[]) throws IOException{
    String file = "hash/ips.txt";
    Scanner scan = new Scanner(new File(file));

    //Implementação em Linked List
    long inicio_ll = System.currentTimeMillis();
    //Criando a linked list dos ips
    LinkedList<String> ips_ll = new LinkedList<String>();
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        ips_ll.add(line);
    }
    String log = "hash/access.log";
    scan = new Scanner(new File(log));

    //Linked List dos acessos
    LinkedList<Integer> access_ll = new LinkedList<Integer>();
    for(int i = 0; i<ips_ll.size(); i++){
        access_ll.add(0);
    }

    //Contagem dos acessos
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        String[] ip = line.split(" - - ");
        if(ips_ll.contains(ip[0])){
            access_ll.set(ips_ll.indexOf(ip[0]),access_ll.get(ips_ll.indexOf(ip[0]))+1);
        }
    }
    long tempo_ll = System.currentTimeMillis() - inicio_ll;


    long inicio_hash = System.currentTimeMillis();
    //Implementação em Hash Map
    Map<String,Integer> ips_hash = new HashMap<String,Integer>();
    scan = new Scanner(new File(file));
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        ips_hash.put(line, 0);
    }
    log = "hash/access.log";
    scan = new Scanner(new File(log));
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        String[] ip = line.split(" - - ");
        if(ips_hash.containsKey(ip[0])){
            ips_hash.put(ip[0], ips_hash.get(ip[0])+1);
        }
    }
    long tempo_hash = System.currentTimeMillis() - inicio_hash;

    //HASH
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    float media = 0;
    int[] mediana = new int[0];

    //LISTA
    int minimo_ll = Integer.MAX_VALUE;
    int maximo_ll = Integer.MIN_VALUE;
    float media_ll = 0;
    int[] mediana_ll = new int[0];

    System.out.println("\nIMPLEMENTAÇÃO EM HASH MAP:        IMPLEMENTAÇÃO EM LISTA ENCADEADA:\n");
    for (String key: ips_hash.keySet()){  
        System.out.printf("     %s = %d                %s = %d\n",key,ips_hash.get(key), ips_ll.get(ips_ll.indexOf(key)), access_ll.get(ips_ll.indexOf(key)));
        
        //HASH
        media = media + ips_hash.get(key);
        if(ips_hash.get(key)<minimo){
            minimo = ips_hash.get(key);
        }
        if(ips_hash.get(key)>maximo){
            maximo = ips_hash.get(key);
        }
        mediana = Arrays.copyOf(mediana, mediana.length+1);
        mediana[mediana.length-1] = ips_hash.get(key);

        //LL
        media_ll = media_ll + access_ll.get(ips_ll.indexOf(key));
        if(access_ll.get(ips_ll.indexOf(key))<minimo_ll){
            minimo_ll = access_ll.get(ips_ll.indexOf(key));
        }
        if(access_ll.get(ips_ll.indexOf(key))>maximo_ll){
            maximo_ll = access_ll.get(ips_ll.indexOf(key));
        }
        mediana_ll = Arrays.copyOf(mediana, mediana.length+1);
        mediana_ll[mediana_ll.length-1] = access_ll.get(ips_ll.indexOf(key));
    }
    media = media/ips_hash.size();
    Arrays.sort(mediana);
    media_ll = media_ll/ips_ll.size();
    Arrays.sort(mediana_ll);

    //Resultados da tabela hash
    System.out.printf("\nO valor mínimo de acessos em hash é: %d\n", minimo);
    System.out.printf("O valor máximo de acessos em hash é: %d\n", maximo);
    System.out.printf("A mediana de acessos dos ips da busca em hash é: %d\n", (mediana.length-1)/2);
    System.out.printf("A média de acessos em hash é: %f\n", media);
    double dp = 0;
    double dp_ll = 0;
    for (String key: ips_hash.keySet()){
        dp = dp + Math.pow(ips_hash.get(key) - media,2);
        dp_ll = dp_ll + Math.pow(access_ll.get(ips_ll.indexOf(key)) - media_ll, 2);
    }
    dp = Math.sqrt(dp/100);
    dp_ll = Math.sqrt(dp_ll/100);
    System.out.printf("O desvio padrão em hash foi: %f\n", dp);


    //Resultados da lista encadeada
    System.out.printf("\n\nO valor mínimo de acessos em lista encadeada é: %d\n", minimo_ll);
    System.out.printf("O valor máximo de acessos em lista encadeada é: %d\n", maximo_ll);
    System.out.printf("A mediana de acessos dos ips da busca em lista encadeada é: %d\n", (mediana_ll.length-1)/2);
    System.out.printf("A média de acessos em lista encadeada é: %f\n", media_ll);
    System.out.printf("O desvio padrão em lista encadeada foi: %f\n", dp_ll);    

    //Tempos de execução
    System.out.printf("\nA diferença de tempo de execuçao dos processos foi de: %s s\n", (tempo_ll-tempo_hash)/1000);
    System.out.printf(" Lista encadeada   |   Tabela hash\n       %s s               %s s", tempo_ll/1000, tempo_hash/1000);
  }
}