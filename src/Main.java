public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação á Objetos
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome ="lee";
        System.out.println(qualquer.falar("oi"));

        // Criar novos objetos
        // Declarar objeto
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome ="Tunner";
        // Definição do comportamento
        rainha.falar();
        rainha.comer();
    }
}