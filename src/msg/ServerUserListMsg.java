package msg;

import java.util.List;


import entity.User;
import net.MyClient;

import net.MyClient;
import entity.User;
/**
 * 记录全体在线用户的报文类，由服务器发往客户端
 * @author 蒋宇森
 * 时间：2017.08.12 
 */
public class ServerUserListMsg extends BaseMsg {
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public ServerUserListMsg(List<User> userList) {
		super();
		this.userList = userList;
	}

	@Override
	public void doBiz() {
		System.out.println(userList);
		MyClient.getMyClient().getRoomlist().showUserList(userList);
	}
}
