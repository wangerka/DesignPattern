# DesignPattern
设计模式分为三种类型，共23种。  


创建型模式：单例模式、抽象工厂模式、建造者模式、工厂模式、原型模式。  

  
结构型模式：适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式。  


行为型模式：模版方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式（Interpreter模式）、状态模式、策略模式、职责链模式、访问者模式。  



4个OO基础  

抽象 封装  继承 多态

9个OO原则  

1，封装变化  

2，多用组合，少用继承   

3，针对接口编程，不针对实现编程    

4，为对象之间的松耦合设计而努力  
5，类应该对扩展开放，对修改关闭  
6，依赖抽象不要依赖具体类


Strategy Pattern：定义算法族，让他们之间可以相互替换，让算法的变化独立于使用算法的客户


Observer Pattern：定义对象之间一对多的依赖关系，当一个对象改变状态时，所有依赖者都会收到通知，并更新。  
Decorator Pattern：动态的将责任附加到对想上。若要扩展功能，装饰者比继承更有弹性！  
Factory Method：定义了一个创建对象的接口，但由子类去决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类

Abstract Factory:提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类  

Singleton ：确保一个类只有一个实例，并提供全局访问点 
