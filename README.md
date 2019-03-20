# Activity的生命周期

> #### Activity 基本上以三种状态存在：
> 
> ##### 继续
> 此 Activity 位于屏幕前台并具有用户焦点。（有时也将此状态称作“运行中”。）
> 
> ##### 暂停
> 另一个 Activity 位于屏幕前台并具有用户焦点，但此 Activity 仍可见。也就是说，另一个 Activity 显示在此 Activity 上方，并且该 Activity 部分透明或未覆盖整个屏幕。 暂停的 Activity 处于完全活动状态（Activity 对象保留在内存中，它保留了所有状态和成员信息，并与窗口管理器保持连接），但在内存极度不足的情况下，可能会被系统终止。
> 
> ##### 停止
> 该 Activity 被另一个 Activity 完全遮盖（该 Activity 目前位于“后台”）。 已停止的 Activity 同样仍处于活动状态（Activity 对象保留在内存中，它保留了所有状态和成员信息，但未与窗口管理器连接）。 不过，它对用户不再可见，在他处需要内存时可能会被系统终止。
> 
> 如果 Activity 处于暂停或停止状态，系统可通过要求其结束（调用其 finish() 方法）或直接终止其进程，将其从内存中删除。（将其结束或终止后）再次打开 Activity 时，必须重建。

### 单个Activity的生命周期

###### 界面样式
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/main1.png)
###### 控制台打印信息
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/1.png)

可以看出，在单个Activity中，开启时同时触发
```
onCreate()
onStart()
onResume()
```
函数

隐藏或切换窗口时触发

```
onPause()
onStop()
```
函数

关闭窗口时触发
```
onDestroy()
```
函数
### 多个Activity的生命周期
###### 界面样式
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/main1.png)
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/main2.png)
###### 控制台打印信息

开启软件时
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/2-1.png)

点击change按钮时
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/2-2.png)

点击回退时
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/2-3.png)

关闭软件时
![image](https://raw.githubusercontent.com/w840980261/androidActivity/master/img/2-4.png)

可以看出，在多个Activity中，MainActivity开启时同时触发
```
onCreate()
onStart()
onResume()
```
函数

---


点击按钮切换到Main2Activity页面，MainActivity暂停

```
onPause()
```
Main2Activity页面开启同时触发
```
onCreate()
onStart()
onResume()
```
函数后
MainActivity停止
```
onStop()
```

---

Main2Activity页面退回MainActivity时，Main2Activity先暂停
```
onPause()
```
MainActivity开启同时触发
```
onRestart()
onStart()
onResume()
```
函数后
Main2Activity停止并关闭
```
onStop()
onDestroy()
```

---

关闭窗口时MainActivity触发
```
onPause()
onStop()
onDestroy()
```
