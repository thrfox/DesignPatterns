## 建造者模式 第13章
## 方法目标
将复杂对象的构建(Builder、Director)与表示(Product)分离

## 应用场景
对象内部构建顺序复杂，将这些构建与产品分离；若需要改变产品的内部细节，只要再重新实现一个Builder就可以完成（如Spring MVC视图层的各种实现）

## 实现思路
1. 指挥者(Director)指挥建造者建造产品的顺序
2. 建造者根据接口定义(Builder)实现具体需要构建的产品
3. 产品为多种多样的类为实现建造者功能服务
