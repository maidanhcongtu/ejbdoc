package mhdanh.ejbdoc.dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import mhdanh.ejbdoc.entity.RoomEntity;

@Stateless
public class RoomDao extends BaseDao<RoomEntity>{
	
	public long persistRoom(RoomEntity roomEntity) {
		getEm().persist(roomEntity);
		return roomEntity.getId();
	}
	
	@SuppressWarnings("unchecked")
	public List<RoomEntity> getAll() {
		String str = "SELECT room FROM RoomEntity room WHERE room.name = :name";
		Query query = getEm().createQuery(str, RoomEntity.class);
		query.setParameter("name", "room 1");
		return query.getResultList();
	}
	
	public int deleteAll() {
		String str = "DELETE FROM RoomEntity room where room.name = :name";
		Query query = getEm().createQuery(str);
		query.setParameter("name", "room 1");
		return query.executeUpdate();
	}
	
	public List<RoomEntity> getAllRoom() {
		Query query = getEm().createNamedQuery("Room.getAll", RoomEntity.class);
		return query.getResultList();
	}
	
}
