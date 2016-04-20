package mhdanh.ejbdoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "room")
@NamedQuery(name="Room.getAll",query="Select r FROM RoomEntity r")
public class RoomEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
