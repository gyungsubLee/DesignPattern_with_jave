package _02_structural_patterns._12_proxy._03_java;

import _02_structural_patterns._12_proxy._02_after.DefaultGameService;
import _02_structural_patterns._12_proxy._02_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = gatGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService gatGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("O");
                    method.invoke(target, args);
                    System.out.println("ㅁ");
                    return null;
                });
    }
}