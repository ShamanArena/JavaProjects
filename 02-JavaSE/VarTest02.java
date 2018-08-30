/*
    关于java语言当中的变量；

        1、在方法体当中的java代码，是遵守自上而下的顺序依次执行的。逐行执行
           第一行
		   第二行
		   第三行
		   特点：第二行的代码必须完整的结束之后，第三行程序才能执行。

		2、
*/
public class VarTest02
{
	public static void main(String[] args){
	    
		int i = 100;//100
		
		i = 200;

        System.out.println(i);//200
        
		//以下代码顺序有错误，先声明再访问
		/*
        System.out.println(k);
		
		int k = 100;
        */

		int i = 90；

		System.out.println(i);
	}
}