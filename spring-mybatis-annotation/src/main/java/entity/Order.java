package entity;

import java.util.Date;

public class Order {

	private long id;
	private Date createAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", createAt=" + createAt + "]";
	}
}
