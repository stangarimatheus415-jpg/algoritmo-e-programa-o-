public class ProjetoUm{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int numero;

       System.out.println("insira um numero interiro");
       numero = sc.nextInt();

       if(numero < 0){
        System.out.println("negativo");
       }
       else{
        System.out.println("posirtivo");
       }
    }   

 
} 
