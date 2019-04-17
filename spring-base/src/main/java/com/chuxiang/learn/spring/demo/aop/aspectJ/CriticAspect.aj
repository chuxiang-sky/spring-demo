package com.chuxiang.learn.spring.demo.aop.aspectJ;

public aspect CriticAspect{

    public CriticAspect(){}

    //将目标bean注入进切面中
    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    //定义切点
    pointcut instance():execution(* com.chuxiang.learn.spring.demo.aop.aspectJ.CriticismEngineImpl.new());

    pointcut perform():execution(* com.chuxiang.learn.spring.demo.aop.target.ConcretePerformance.perform(..));

    //定义通知
    before():instance(){
        System.out.println("开始初始化CriticismEngineImpl");
    }

    after():instance(){
        System.out.println("初始化CriticismEngineImpl成功");
    }


    after():perform(){
        System.out.println(criticismEngine.getCriticism());
    }
}