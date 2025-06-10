
public class ZombieGame {

	public static void main(String args[]) {
		Zombie zom1 = new Zombie("좀비1", 7);
		Zombie zom2 = new Zombie("좀비2", 15);
		Hero hero = new Hero("조강홍", 1, 3);
		
		System.out.println("좀비 게임을 시작합니다.!!!");
		while(true) {
			hero.move();	//주인공 이동/점프
			zom1.move();	//좀비 이동 
			zom2.move();	//좀비 이동 
			if((hero.getPos() == zom1.getPos())||(hero.getPos() == zom2.getPos())) {
				hero.life--;
				if(hero.life == 0) {
					System.out.println("생명이 0 입니다. 게임을 종료합니다.");
					break;
				}
				else {
					System.out.println("좀비에게 잡혔습니다. 생명이 " + hero.life + "남았습니다.");
					System.out.println("게임을 처음 위치에서 다시 시작합니다.");
					hero.setPos(0);
				}
			}
			if(hero.getPos()>=20) {
				System.out.println("미션클리어!!! 목적지에 도착했습니다.");
				break;
			}
		}
	}
}
