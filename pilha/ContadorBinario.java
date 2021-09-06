package pilha;

import java.util.ArrayDeque;
import java.util.Queue;
 
class ContadorBinario
{
    public static void contador(int n)
    {
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        int i = 1;
        while (i++ <= n)
        {
            q.add(q.peek() + '0');
            q.add(q.peek() + '1');
            System.out.print(q.poll() + ' ');
        }
    }
 
    public static void main(String[] args)
    {
        int n = 6;
        contador(n);
    }
}
