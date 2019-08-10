## 策略模式 第2章
## 方法目标
收银系统，提供多种可变化的促销功能

## 应用场景
在多变化的算法中，用来封装算法，减少算法类(SalesSuper)与真正算法(SalesNormal)的耦合

## 实现思路
1. 根据算法父类以相同的方式调用所有的算法(SalesSuper.acceptCash)
2. 使用策略(CashContext)，构造器中获得SalesSuper，指定一个算法(SalesNormal,SalesReturn)

