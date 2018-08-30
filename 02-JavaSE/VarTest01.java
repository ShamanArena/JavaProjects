/*
   关于Java语言中的变量:

        1.什么是变量?
            *变量本质上是内存中的一块空间,这块空间"有数据类型","有名字","有字面值".
			*变量包含三部分:数据类型,名称,字面值[数据]
			*变量是内存中存储数据最基本的单元.

		2.数据类型的作用?
		    *不同的数据有不同的类型,不同的数据类型底层会分配不同大小的空间.
			*数据类型是指导程序在运行阶段应该分配多大的内存空间.

        3.变量要求:变量中存储的具体的"数据"必须和变量的"数据类型"一致,当不一致时,编译报错.

		4.声明/定义变量的语法格式:
		    数据类型 变量名;
			    *数据类型:
				    int(整数型);
				*变量名:
				    只要是合法的标识符,规范中要求:首字母小写,后面每个单词首字母大写.
			例如:
			    int i;
				int age;
				int length;
				int size;
                int num;

				其中int是数据类型,i,age,length,size,num都是变量名
		5.变量声明之后怎么赋值?
		    语法格式:
			    变量名 = 字面值
			要求:字面值的数据类型必须和变量的数据类型一致.
			= 等号是一个运算符,叫做赋值运算符,赋值运算符先运算等号右边的表达式,表达式
			执行结束之后的结果赋值给左边的变量.

		6.声明和赋值可以放到一起完成.
		    int i = 10;

		7.变量赋值之后,可以重新赋值,变量的值可变化:
		    int i = 20;
            System.out.println(i);//10
			i = 20;
			System.out.println(i);//20
			i = 100;
		    System.out.println(i);//100

		8.有了变量的概念之后,内存空间得到了重复的使用:
		    int i = 10;
			System.out.println(i);
			...
			....
			System.out.println(i);

        9.通常访问一个变量包括两种访问方式:
		    *第一种:读取变量中保存的具体数据 get/获取
			*第二种:修改变量中保存的具体数据 set/设置

            i = 20;//set

			System.out.println(i);//get 

		10.变量在一行上可以声明多个
		    int a,b,c;
		
		11.Java中的变量必须先声明,再赋值,才能访问.
		    int i;程序执行到这里,内存空间并没有开辟出来,变量i并没有初始化.所以没有赋值之前是无法访问
*/
public class VarTest01
{
	public static void main(String[] args){
		//声明一个int类型的变量,起名i
		int i;
        //编译报错:变量i并没有初始化
		//System.out.println(i);
        
		//给i变量赋值,i变量在这里完成初始化，内存开辟
        i = 100;
		System.out.println(i);  

		//i再次重新赋值
		i = 200;
		System.out.println(i);

		//一行上可以同时赋值多个变量
		//a和b尚未初始化，c赋值300
		int a,b,c = 300;
		
		//编译错误
        //System.out.println(a);
       
		//编译错误
		//System.out.println(b);

		System.out.println(c);

        a = 0;
		b = 1;
		System.out.println(a);
		System.out.println(b);
    }
}