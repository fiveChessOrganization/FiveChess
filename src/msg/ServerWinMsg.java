package msg;

import net.MyClient;
/**
 * 服务器向胜利的一方发送的报文类
 * @author 蒋宇森
 *
 */
public class ServerWinMsg extends BaseMsg{

	public void doBiz() {
        MyClient.getMyClient().getRoom().win();		
	}

}
