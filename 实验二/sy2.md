## 实验二 构建第一个Kotlin应用  
### 创建第一个Kotlin应用
打开Android Studio，选择Projects>New Project，然后选择Basic Activity.
![](/实验二/pic/屏幕截图%202023-04-25%20233947.png)
### 1、Android Studio的界面布局
Android Studio工作区:
![](/实验二/pic/屏幕截图%202023-04-26%20020038.png)
### 2、创建模拟器
#### 创建可以运行APP的模拟器
点击Create device，弹出创建模拟器的页面
![](/实验二/pic/屏幕截图%202023-04-26%20013447.png)
#### 下载镜像
在系统镜像页面的Recommended标签栏，选择最新镜像
![](/实验二/pic/屏幕截图%202023-04-26%20015001.png)
#### 在模拟器上运行应用程序  
选择Run>Run ‘app’，在工具栏上可以看到运行程序的一些选择项
![](/实验二/pic/屏幕截图%202023-04-26%20015316.png)
#### 运行效果：
![](/实验二/pic/屏幕截图%202023-04-26%20015827.png)
### 3、查看布局编辑器
#### 什么是布局编辑器
当我们打开 XML 布局文件时，就会显示布局编辑器，如下图：
![](/实验二/pic/5ecfaf8d09e2124426441482.jpg)
1. Palette：包含可以拖到布局中的各种视图和视图组
2. Component Tree：显示布局中的组件层次结构
3. 工具栏：点击这些按钮可在编辑器中配置布局外观及更改布局属性
4. 设计编辑器：在 Design 视图和/或 Blueprint 视图中修改布局
5. Attributes：用于对所选视图的属性进行控制的控件
6. 视图模式：采用 Code 模式、Design 模式或 Split 模式模式查看布局。Split 模式会同时显示 Code 和 Design 窗口
7. 缩放和平移控件：控制编辑器内的预览大小和位置
#### 如何更改预览外观
Android 布局编辑器支持在不同配置下的预览，我们可以使用设计编辑器顶行中的按钮在编辑器中配置布局的外观。
![](/实验二/pic/5ecfaf9b0987c94809160140.jpg)
1. Design 和 Blueprint：选择我们希望如何在编辑器中查看布局。选择 Design 可查看布局的渲染后预览效果。选择 Blueprint 可仅查看每个视图的轮廓。选择 Design + Blueprint 可并排查看这两个视图；
2. 屏幕方向和布局变体：选择屏幕方向（横向和纵向），或选择应用提供备用布局的其他屏幕模式（例如夜间模式）。该菜单还包含用于创建新布局变体的命令；
3. 设备类型和尺寸：选择设备类型（手机/平板电脑、Android TV 或 Wear OS）和屏幕配置（尺寸和密度）。我们可以从多种预配置的设备类型和 AVD 定义中选择，也可以从列表中选择 Add Device Definition 创建新的 AVD；
4. API 版本：选择预览布局时使用的 Android 版本；
5. AppTheme：选择要应用于预览的界面主题背景。请注意，这仅适用于支持的布局样式，因此该列表中的许多主题背景都会导致出错；
6. Language：选择要以何种语言显示界面字符串。此列表仅会显示我们的字符串资源支持的语言。如果想要修改翻译，点击点击下拉菜单中的 Edit Translations。  
#### 如何修改视图属性  
查看布局的代码（Code），修改Textview的Text属性 
```Kotlin
    android:text="Hello World!"
```
修改字符串属性值为“Hello Kotlin!”。更进一步，修改字体显示属性，在Design视图中选择textview_first文本组件，在Common Attributes属性下的 textAppearance域，设置相关的文字显示属性  
![](/实验二/pic/屏幕截图%202023-04-26%20153035.png)  
查看布局的XML代码，可以看到新属性被应用。
```Kotlin
android:fontFamily="sans-serif-condensed"
android:text="@string/hello_kotlin"
android:textColor="#9C27B0"
android:textSize="24sp"
```
### 4、向页面添加更多的布局
本步骤将向第一个Fragment添加更多的视图组件  
#### 查看视图的布局约束
在fragment_first.xml，查看TextView组件的约束属性在约束布局中，每个组件至少需要一个水平方向和一个垂直方向的约束：
```Kotlin
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />
```
#### 添加按钮和约束  
从Palette面板中拖动Button  
![](/实验二/pic/屏幕截图%202023-04-26%20154359.png)  
调整Button的约束，设置Button的Top>BottonOf textView  














