public class EstudoFinalDeMain {
    public static void main(String[] args) {
        System.out.println("Iniciando o estudo main, entrando no método a");
        a();
        System.out.println("Finalizando o main");
    }
    static void a (){
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizando o método a");
    }
    static void b (){
        System.out.println("Entrou no método b");
        for(int numero=0; numero <=4; numero++) System.out.println(numero);
        c();
        System.out.println("Finalizando o método b");
    }
    static void c (){
        System.out.println("Entrou no método c");
        //Thread.dumpStack();
        System.out.println("Finalizando método c");
    }
}
