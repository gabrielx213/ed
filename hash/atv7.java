package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class atv7 {

  public static void main (String args[]) throws IOException{
    String file = "hash/ips.txt";
    Map<String,Integer> ips = new HashMap<String,Integer>();
    Scanner scan = new Scanner(new File(file));
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        ips.put(line, 0);
    }
    String log = "hash/access.log";
    scan = new Scanner(new File(log));
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        String[] ip = line.split(" - - ");
        if(ips.containsKey(ip[0])){
            ips.put(ip[0], ips.get(ip[0])+1);
        }
    }
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    float media = 0;
    int[] mediana = new int[0];
    for (String key: ips.keySet()){  
        System.out.println(key+ " = " + ips.get(key));
        media = media + ips.get(key);
        if(ips.get(key)<minimo){
            minimo = ips.get(key);
        }
        if(ips.get(key)>maximo){
            maximo = ips.get(key);
        }
        mediana = Arrays.copyOf(mediana, mediana.length+1);
        mediana[mediana.length-1] = ips.get(key);
    }
    media = media/ips.size();
    Arrays.sort(mediana);
    System.out.printf("O valor mínimo de acessos é: %d\n", minimo);
    System.out.printf("O valor máximo de acessos é: %d\n", maximo);
    System.out.printf("A mediana de acessos dos ips da busca é: %d\n", (mediana.length-1)/2);
    System.out.printf("A média de acessos é: %f\n", media);
  }
}