import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Zombie extends  {
	Random r = new Random();
	
	public Zombie(String name, int pos) {
		super(name, pos);
	}
	public void move() {
		int dir = r.nextInt(3);
		if(dir==0) {
			pos = pos - 1;
			if(pos < 0) pos = 0;
		}
		else if(dir==1) {
			pos = pos + 1;
			if(pos > 20) pos = 20;
		}
		else pos = pos+0;	//���ڸ��� ��
		System.out.println(name+"�� ���� ��ġ�� " + pos + "�Դϴ�.");
	}
}
