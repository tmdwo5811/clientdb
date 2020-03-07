package com.client.db.service;


public class Test {
	
	public void cal(int num) {
		System.out.println("메소드 실행");
		
		int blankCount = 1;
		blankCount = num - blankCount;
		int ii = 0;
		for(int y=0;y<num;y++) {
			for(int a=0;a<blankCount;a++) {
				System.out.print(' ');
			}
			for(int b=0;b<ii;b++) {
				System.out.print('*');
			}
			for(int c=0;c<blankCount;c++) {
				System.out.print(' ');
			}
			ii=ii+2;
			blankCount=blankCount-1;
			System.out.println(" ");
		}
		for(int z=0;z<num-1;z++) {
			for(int d=blankCount;d>0;d--) {
				System.out.print(' ');
			}
			for(int E=ii;E>0;E--) {
				System.out.print('*');
			}
			for(int f=blankCount;f>0;f--) {
				System.out.print(' ');
			}
			ii=ii-2;
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.cal(2);
	}

}
