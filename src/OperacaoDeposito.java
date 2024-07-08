public class OperacaoDeposito extends Operacao implements Comparable{

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    @Override
    public double calcularTaxas() {
        return 0f;
    }

    public int compareTo(Operacao outro){
        if(this.tipo == 's'){
            return 1;
        }else{
            return 0;
        }
    }
}
