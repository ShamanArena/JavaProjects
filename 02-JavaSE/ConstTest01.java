/*
      
	关于字面值：
	    *字面值
		    -10、100
			-"abc"
			-'a'
			-ture、false
			-3.14
        *字面值就是数据。

		*字面值是Java源程序的组成部分之一
		
        *数据在现实世界中分门别类的，所以数据在计算机编程语言当中也是有类型的：【数据类型】
		    -10、100         属于整数型字面值
			-3.14            属于浮点型字面值
			-true、false     属于布尔型字面值
			-"abc"、"中国人" 属于字符串型字面值
			-'A'、'人'       属于字符型字面值
        *注意：
		    java语言当中所有的字符串型字面值必须使用双引号括起来，双引号是半角
			Java语言当中所有的字符型字面值必须使用单引号括起来，单引号是半角

*/
public class ConstTest01
{
	public static void main(String[] args) 
	{
		System.out.println("abc");
		
		System.out.println("最近你过得怎么样？");
		
		System.out.println(10);
		
		System.out.println(100);
		
		System.out.println(false);
		
		System.out.println(true);
		
		System.out.println('A');
		
		System.out.println(3.14);
        
		//编译报错，因为单引号中只能存放单个字符，属于字符型字面值
		//System.out.println('ABC');
		
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);


	}
}
