package javacore.orientacaoobjetos.enums.dominio;

public enum TipoPessoa {
    PESSOA_FISICA(1, "Pessoa fisica"){
        @Override
        public double calculateDiscount(double value){
            return 0.2 * value;
        }
    }, // podemos passar quantos paramos quisermos desde que tenha no construtor
    PESSOA_JURIDICA(2, "Pessoa juridica"){
        @Override
        public double calculateDiscount(double value){
            return 0.1 * value;
        }
    };

    public final int value; // final makes unaditable
    public final String tipoRelatorio;

    TipoPessoa(int value, String tipoRelatorio){
        this.value = value;
        this.tipoRelatorio = tipoRelatorio;
    }

    public static TipoPessoa getByTipoRelatorio(String tipoRelatorio){
        for (TipoPessoa tipo : TipoPessoa.values()){
            if (tipo.tipoRelatorio.equals(tipoRelatorio)){
                return tipo;
            }
        }
        return null;
    }

    public abstract double calculateDiscount(double value);
}
