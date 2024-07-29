package javacore.orientacaoobjetos.modificadorfinal;

import java.util.Calendar;

public class Carro {
    public final int VELOCIDADE_MAXIMA; // cada classe tem a sua
    /*
    UMA FORMA DE INICIALIZAR A CONSTANTE É PELO BLOCO DE INICIALIZACAO
    {
        VELOCIDADE_MAXIMA = 50;
    }
     */

    public static int NUMERO_DE_RODAS = 4; // OU PODE SER INICIALIZADO DIRETAMENTE TAMBEM
    /*
    PODE SER INICIALIZADO NO BLOCO DE INICIALIZACAO ESTATICO

    static{
        NUMERO_DE_RODAS = 4;
    }
     */

    public static final Calendar CREATED_AT = Calendar.getInstance(); // NAO PODEMOS MUDAR A REFERENCIA, MAS O OBJETO PODEMOS

    public Carro(){
        VELOCIDADE_MAXIMA = 250; // PODE SER INSTANCIADO NO CONSTRUTOR DESDE QUE NAO SEJA STATIC
        CREATED_AT.add(Calendar.DAY_OF_WEEK, 4); // VOCE PODE MODIFICAR, MENOS MUDAR A REFERENCIA
        //CREATED_AT = Calendar.getInstance(); ===> isso nao compilaria
    }
}
