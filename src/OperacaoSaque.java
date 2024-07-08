public class OperacaoSaque extends Operacao implements Comparable<OperacaoSaque>{

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    @Override
    public double calcularTaxas() {
        return 0.05;
    }

    @Override
    public int compareTo(Operacao outro){
        if(this.tipo == 's'){
            return 1;
        }else{
            return 0;
        }
    }
}
