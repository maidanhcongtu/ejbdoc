package mhdanh.ejbdoc.bussiness;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mhdanh.ejbdoc.dao.RoomDao;
import mhdanh.ejbdoc.entity.RoomEntity;

@Stateless
public class RoomBusiness {
	
	@EJB
	private RoomDao roomDao;
	
	public long saveRoom() {
		
		RoomEntity roomEntity = new RoomEntity();
		roomEntity.setName("room 1");
		roomEntity.setCreatedBy("admin");
		roomEntity.setCreatedDate(new Date());
		
		return roomDao.persistRoom(roomEntity);
	}
	
	public List<RoomEntity> getAllRooms() {
		return roomDao.getAll();
	}
	
	public int deleteAll() {
		return roomDao.deleteAll();
	}

	public List<RoomEntity> getAllRoomsByNameQuery() {
		return roomDao.getAllRoom();
	}
	
}
