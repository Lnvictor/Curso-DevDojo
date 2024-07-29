package javacore.orientacaoobjetos.modificadorfinal;

// uma classe que contem o final, nao pode ser pai de nenhuma outra classe
public final class Subaru extends Carro {
    public final void myMethod(){
        //metodos finais nao podem ser sobrescritos....
    }

}

/*
class AM3 extends Subaru{
    @Override
    public final void myMethod(){

    }
}

Isto nao compilaria, nao e possivel herdar de final class
 */