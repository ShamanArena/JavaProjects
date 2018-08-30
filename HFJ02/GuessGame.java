public class GuessGame
{
	public void startGame() //游戏规则
	{
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();//创建三个新的player对象

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;//初始化player猜测数字为0

		boolean p1isRight = false;
        boolean p2isRight = false;
		boolean p3isRight = false;//初始化player答案正确性为否

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9 ... ");//0~9间随机产生谜底数字

		while (true)
		{
			System.out.println("Number to guess is " + targetNumber);//裁判向观众展示答案

			p1.guess();
			p2.guess();
			p3.guess();//player们开始猜测答案

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			guessp3 = p3.number;
			System.out.println("player three guessed " + guessp3);//player们公布所猜答案

			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			if (guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			if (guessp3 == targetNumber)
			{
				p3isRight = true;
			}//裁判检查player们是否猜中答案
			
			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner！");
				System.out.println("Number to guess is..." + targetNumber);
				System.out.println("Game is over.");
				break;
				//任意player猜出答案，裁判公布答案，游戏结束
			}else
			{
				System.out.println("Players will have to try again.");
				//没有player猜出答案比赛继续
			}//if/else结束
		}//循环结束
	}//方法结束
}//类结束

class player//guess方法模拟出player猜数字的心理活动
{
	int number;//??如果不赋值会如何？

	public void guess()
	{
	    number = (int)(Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
class GameLauncher
{
	public static void main (String[] args)
	{
		GuessGame game = new GuessGame();//建立一个房间
		game.startGame();//按照startgame的游戏规则开始游戏
	}
}