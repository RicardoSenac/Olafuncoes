public class App {
    public static void main(String[] args) throws Exception {

        float comissao = calcularPercentual (100.00f, 20);
        System.out.println(comissao);

        float novoValor = Utils.calcularAcrescimo (100.00f, 100.00f);
            System.out.println(novoValor);
    
            
    }
}
