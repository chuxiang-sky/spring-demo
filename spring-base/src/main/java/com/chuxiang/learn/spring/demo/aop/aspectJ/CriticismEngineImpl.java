package com.chuxiang.learn.spring.demo.aop.aspectJ;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
public class CriticismEngineImpl implements CriticismEngine {

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    @Override
    public String getCriticism() {
        return criticismPool[(int)Math.random()*criticismPool.length];
    }
}
