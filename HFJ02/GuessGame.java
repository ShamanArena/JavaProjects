public class GuessGame
{
	public void startGame() //��Ϸ����
	{
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();//���������µ�player����

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;//��ʼ��player�²�����Ϊ0

		boolean p1isRight = false;
        boolean p2isRight = false;
		boolean p3isRight = false;//��ʼ��player����ȷ��Ϊ��

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9 ... ");//0~9����������յ�����

		while (true)
		{
			System.out.println("Number to guess is " + targetNumber);//���������չʾ��

			p1.guess();
			p2.guess();
			p3.guess();//player�ǿ�ʼ�²��

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			guessp3 = p3.number;
			System.out.println("player three guessed " + guessp3);//player�ǹ������´�

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
			}//���м��player���Ƿ���д�
			
			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner��");
				System.out.println("Number to guess is..." + targetNumber);
				System.out.println("Game is over.");
				break;
				//����player�³��𰸣����й����𰸣���Ϸ����
			}else
			{
				System.out.println("Players will have to try again.");
				//û��player�³��𰸱�������
			}//if/else����
		}//ѭ������
	}//��������
}//�����

class player//guess����ģ���player�����ֵ�����
{
	int number;//??�������ֵ����Σ�

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
		GuessGame game = new GuessGame();//����һ������
		game.startGame();//����startgame����Ϸ����ʼ��Ϸ
	}
}