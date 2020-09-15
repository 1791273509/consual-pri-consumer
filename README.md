# 仅用于记录一下SpringBoot服务注册进入consul中
整合过程中遇到的一些问题
1. SpringBoot版本不能太高，至少我这里的2.3.3版本没有成功
2. 注意配置文件中的host不是hostname!!!坑死我了
3. RestTemplate 注意要加注解@LoadBanlance注解，不加的话不行！！！
4. 没有4，consul安装可以使用docker，也可以使用客户端安装，无所谓

