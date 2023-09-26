package chapter18.com.hspedu.tankgame4.copy;

public class Bomb {
	int x, y;// 炸彈坐標
	int life = 9;// 炸彈生命周期
	boolean isLive = true;

	public Bomb(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 減少生命值
	public void LifeDown() {// 配合出現圖片的爆炸效果
		if (life > 0) {
			life--;
		} else {
			isLive = false;
		}
	}
}
