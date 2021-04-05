# Summary of design pattern
...
Prototype Pattern: https://www.youtube.com/watch?v=_Ab8IxtFrGc&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=54
Decorator Pattern: https://www.youtube.com/watch?v=3CMT4tbDVjE&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=77
Composite Pattern: https://www.youtube.com/watch?v=Xia_UPxhZ4A&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=81
Facade Pattern: https://www.youtube.com/watch?v=dOUB-RcDH-o&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=86
Flyweight Pattern: https://www.youtube.com/watch?v=ACApqar-I3g&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=91

Template Pattern: https://www.youtube.com/watch?v=LLSiXZYppUs&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=101

## Builder Pattern

video: https://www.youtube.com/watch?v=BcwVLx6XLBA&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=59

### 4 Roles 
- Product
- AbstractBuilder
- ConcreteBuilder
- Director

DesignPattern.src.com.xinxin.designpattern.builder.improve

Product: House

AbstractBuilder: HouseBuilder

ConcreteBuilder: CommonHouse, HighBuilding, Others

Director: HouseDirector 



JDK StringBuilder

Product: String

AbstractBuilder: Appendable, AbstractStringBuilder

ConcreteBuilder: StringBuilder

Director: StringBuilder