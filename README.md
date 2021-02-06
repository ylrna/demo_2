# demo

运行并测试的步骤:

1.将项目克隆到本地，进入项目目录，并运行命令窗口(可在文件夹目录路径输入"cmd")

命令窗口输入：“mvn package”,打包成jar包，可以查看到target目录下生成的jar包 face.demo-1.0-SNAPSHOT.jar


2.命令窗口进入target 目录 可直接输入命令"cd target"进入

命令窗口输入 "java -jar face.demo-1.0-SNAPSHOT.jar"，运行该项目

运行结果输出如下图

![结果输出](https://github.com/ylrna/image/blob/main/main.png)

异常说明:

1.非法数据，提示 “输入数据中，存在非法数据！请输入0-99之间的数据”

2.数组为空或数组长度为0 ，提示请输入数据



单元测试类 Test

结果如下图：

![junit 测试结果](https://github.com/ylrna/image/blob/main/test.png)