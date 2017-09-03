package msg;

import net.MyClient;

/**
 *服务器传递开始游戏报文给客户端 
 * @author 蒋宇森
 *
 */
public class ServerStartGame extends BaseMsg{

	public void doBiz() {
		MyClient.getMyClient().getRoom().gameStart();
		System.out.println("游戏开始报文");
	}

}
