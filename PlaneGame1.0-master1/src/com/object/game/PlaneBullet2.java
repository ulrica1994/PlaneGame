package com.object.game;

import java.awt.Graphics;
import java.awt.Image;

public class PlaneBullet2 extends Bullet {
	private static Image bullet_img;
	static{
		bullet_img=GameUtil.getImage("images/bullet2.png");
	}
	public PlaneBullet2(){
		super();
		setHeight(bullet_img.getHeight(null));
		setWidth(bullet_img.getWidth(null));
	}
	public void drawSelf(Graphics g) {
		if(isLive()){
			g.drawImage(bullet_img, (int)getX(), (int)getY(), null);
			move();	
			checkLocation();
		}
	}
	public void checkLocation() {
		if(getY()<0)setLive(false);
	}
	
	public void move() {
		moveY(getY()-Constant.BULLET_STEP);
	}

}
