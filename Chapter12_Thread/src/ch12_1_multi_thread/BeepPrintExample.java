package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		/*
		 * 0.5�� �ֱ�� beep �� �߻� �� ���� ���
		 */
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		for(int i=0;i<5;i++) {
			System.out.println("ding");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}