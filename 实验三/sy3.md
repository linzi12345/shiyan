## 实验二 Jupyter Notebook实践 
### 实验内容
安装Jupyter Notebook和相关的Python环境，建议采用Anaconda的安装方式。  
1. 按照教程完成实验过程，主要包括几个方面：  
2. 掌握Notebook工具的基本原理  
3. 学习Python基本语法，完成选择排序程序  
4. 完成Python数据分析的例子  
5. 将上述完成的Jupyter Notebook在Github上进行共享。  
### 1、Jupyter Notebook简介
Anaconda是安装Jupyter Notebook的最佳方式。安装完成之后，启动Anaconda的Navigator，并启动Notebook，呈现如下界面：
![](/实验三/pic/屏幕截图%202023-05-05%20002704.png)
观察页面，可以看到浏览器中显示类似 https://localhost:8888/tree 的网址，代表本地运行着Notebook的服务器
#### 创建一个新的Notebook
新建一个Notebook Python 3 (ipykernel)，生成了一个Untitled.ipynb文件。.ipynb文件即所谓的一个Notebook，实际是基于JSON格式的文本文件，并且包含元数据(“Edit > Edit Notebook Metadata”)。新建的Notebook的界面大致如下：  
![](/实验三/pic/屏幕截图%202023-05-05%20005135.png)
这里有两个关键元素cell和kernal

1. cell: 文本或者代码执行单元，由kernel执行。
2. kernel: 计算引擎，执行cell的文本或者代码，本文基于Python 3 ipykernel引擎。
#### cell
主要包含两种类型的cell：

1. 代码cell：包含可被kernel执行的代码，执行之后在下方显示输出。
2. Markdown cell：书写Markdown标记语言的cell。
试着输入一行代码，查看执行效果：
```python
print('Hello World!')
```
![](/实验三/pic/屏幕截图%202023-05-05%20005515.png)
代码执行之后，cell左侧的标签从```In [ ]``` 变成了 ```In [1]```。In代表输入，[]中的数字代表kernel执行的顺序，而```In [*]```则表示代码cell正在执行代码。
##### cell模式
有两种模式，编辑模式（edit mode）和命名模式（command mode）

1. 编辑模式：enter键切换，绿色轮廓
2. 命令模式：esc键切换，蓝色轮廓
##### 快捷键
使用Ctrl + Shift + P命令可以查看所有Notebook支持的命令。  
1. 上下键头可以上下cell移动
2. A 或者 B在上方或者下方插入一个cell
3. M 将转换活动cell为Markdown cell
4. Y 将设置活动cell为代码 cell
5. D+D（两次）删除cell
6. Z 撤销删除
7. H 打开所有快捷键的说明
#### Kernel
每个notebook都基于一个内核运行，当执行cell代码时，代码将在内核当中运行，运行的结果会显示在页面上。Kernel中运行的状态在整个文档中是延续的，可以跨越所有的cell。这意思着在一个Notebook某个cell定义的函数或者变量等，在其他cell也可以使用。例如：
```python
import numpy as np
def square(x):
    return x * x
```
执行上述代码cell之后，后续cell可以使用np和square:
```python
x = np.random.randint(1, 10)
y = square(x)
print('%d squared is %d' % (x, y))
```
执行效果：
![](/实验三/pic/屏幕截图%202023-05-05%20010231.png)
注意：Restart Kernal将清空保存在内存中的变量。同时，在浏览器中关闭一个正在运行的notebook页面，并未真正关闭终止Kernel的运行，其还是后台执行。要真正关闭，可选择File > Close and Halt，或者Kernel > Shutdown。
### 2、熟悉基本的Python语法


### 3、数据分析

### 4、数据图形绘制

### 5、分享Notebooks

### 6、Jupyter Notebook扩展工具

