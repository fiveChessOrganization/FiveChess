package msg;

import java.util.List;

import net.MyClient;
import entity.RoomPojo;
/**
 * 记录房间列表的报文类，由服务器发往客户端
 * @author 蒋宇森
 * 时间：2017.08.12
 */
public class ServerRoomListMsg extends BaseMsg {
	private List<RoomPojo> roomList;

	public ServerRoomListMsg(List<RoomPojo> roomList) {
		super();
		this.roomList = roomList;
	}

	public List<RoomPojo> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<RoomPojo> roomList) {
		this.roomList = roomList;
	}

	@Override
	public void doBiz() {
		MyClient.getMyClient().getRoomlist().showRoomList(roomList);
	}
}
