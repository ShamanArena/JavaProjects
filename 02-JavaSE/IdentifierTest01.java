/*
    关于Java语言当中的标识符
	    1、什么是标识符？
            -在Java源程序中凡是程序员有权利自己命名的单词都是标识符。
			-标识符在编辑器中以黑色字体高亮显示
			-标识符可以标识什么元素呢？
			    *类名
				*方法名
				*变量名
				*接口名
				*常量名
				……

		2、标识符的命名规则？【不按这个规则来，编译器会报错，这是语法】
            *一个合法的标识符只能由“数字、字母、下划线_、美元符号$”组成，不冷含有其他符号
			*不能数字开头
			*严格区分大小写
			*关键字不能做标识符
			*理论上无长度限制，但最好不要太长

		3、标识符的命名规范？【只是一种规范，不属于语法，不遵守规范编译器不会报错】
		    *最好见名知意
                public class UserService{
			   	    public void login(String username,String password){		   
				    }
			    }
			*遵守驼峰命名方式
			    Systemservice
			    Userservice
			    CustomerService
            *类名、接口名：首字母大写，后面每个单词首字母大写

			*变量名、方法名：首字母小写，后面每个单词首字母大写

			*常量名：全部大写
		
		4、合法的和不合法的标识符
		    合法             不合法
			-----------------------
            _123Test         123Test
			HelloWorld       HelloWorld!
            A_B_C            HelloWorld#
            $ABC             Hello World
			class1           class
			public0          public

*/
public class IdentifierTest01//IdentifierTest01是一个类名，名字可以修改
{
	//main是一个方法名
	
    public static void main(String[] args){//args是一个变量名
        int a = 1
	}
    
	//dosome是一个方法名
	public static void dosome(){
		//i就是变量名
		int i = 10
	}		 	
}  