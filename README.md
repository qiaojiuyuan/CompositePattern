# CompositePattern
## 组合模式
### 项目类图
![组合模式项目类图](https://github.com/qiaojiuyuan/CompositePattern/raw/master/composite_class.png)
### 通用类图
![通用类图](https://github.com/qiaojiuyuan/CompositePattern/raw/master/common_class.png)
### 定义
```
组合模式也叫合成模式，有时又叫部分-整体模式，主要是用来描述部分与整体的关系。
将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
```
### 优点
* 高层模块调用简单
一棵树形机构中的所有节点都是Component,局部和整体对调用者来说没有任何区别。
* 节点自由增加
### 缺点
* 与依赖倒置原则冲突
### 使用场景
* 维护和展示部分-整体关系的场景，如树形菜单、文件等
* 从一个整体中能够独立出部分模块或功能的场景
