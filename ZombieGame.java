
public class ZombieGame {

	public static void main(String args[]) {
		Zombie zom1 = new Zombie("����1", 7);
		Zombie zom2 = new Zombie("����2", 15);
		Hero hero = new Hero("����ȫ", 1, 3);
		
		System.out.println("���� ������ �����մϴ�.!!!");
		while(true) {
			hero.move();	//���ΰ� �̵�/����
			zom1.move();	//���� �̵� 
			zom2.move();	//���� �̵� 
			if((hero.getPos() == zom1.getPos())||(hero.getPos() == zom2.getPos())) {
				hero.life--;
				if(hero.life == 0) {
					System.out.println("������ 0 �Դϴ�. ������ �����մϴ�.");
					break;
				}
				else {
					System.out.println("���񿡰� �������ϴ�. ������ " + hero.life + "���ҽ��ϴ�.");
					System.out.println("������ ó�� ��ġ���� �ٽ� �����մϴ�.");
					hero.setPos(0);
				}
			}
			if(hero.getPos()>=20) {
				System.out.println("�̼�Ŭ����!!! �������� �����߽��ϴ�.");
				break;
			}
		}
	}
}
