public class App {
    public static void main(String[] args) throws Exception {
        int[] listaNumeros = new int[] { 100, 110, 50, 80, 10, 11, 15, 8, 9 };

        heapSort(listaNumeros);

        for (int i = 0; i < listaNumeros.length; i++)
            System.out.println(listaNumeros[i]);
    }

    private static void maxHeapify( int a[], int inicio, int fim)
    {     
      int base = 2 * inicio + 1;
      if( base < fim )
      {
        if( (base + 1) < fim && a[base] < a[base + 1])
         ++base;
           
        if( a[base] > a[inicio] )
        {
         int aux = a[base];
         a[base] = a[inicio];
         a[inicio] = aux;

         maxHeapify( a, base, fim);
        }
       }
    }
       
    private static void heapSort(int a[])
    {
      int tamanhoArray = a.length;
      for(int k = tamanhoArray/2; k >= 0; k--) 
       maxHeapify( a, k, tamanhoArray);         
    
      while (tamanhoArray-1 > 0)
      {
        int aux = a[tamanhoArray-1];
        a[tamanhoArray-1] = a[0];
        a[0] = aux;

        maxHeapify(a, 0, tamanhoArray-1);  
        tamanhoArray--;
      }
    }
}