package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        // Demonstrando o padrão Singleton
        
        System.out.println("Demonstrando Singleton:");
        
        // Singleton Lazy
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println("SingletonLazy 1: " + lazy1);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println("SingletonLazy 2: " + lazy2);
        
        // Singleton Eager
        SingletonEager eager1 = SingletonEager.getInstancia();
        System.out.println("SingletonEager 1: " + eager1);
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println("SingletonEager 2: " + eager2);
        
        // Singleton Lazy Holder
        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
        System.out.println("SingletonLazyHolder 1: " + lazyHolder1);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println("SingletonLazyHolder 2: " + lazyHolder2);
        
        // Demonstrando o padrão Strategy
        
        System.out.println("\nDemonstrando Strategy:");
        
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        
        // Robo com comportamento normal
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();
        
        // Robo com comportamento defensivo
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        
        // Robo com comportamento agressivo
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        // Demonstrando o padrão Facade
        
        System.out.println("\nDemonstrando Facade:");
        
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}
