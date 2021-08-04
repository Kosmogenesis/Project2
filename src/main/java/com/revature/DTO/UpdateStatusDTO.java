package com.revature.DTO;

import java.util.Objects;

public class UpdateStatusDTO {

	public int status;

	public UpdateStatusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateStatusDTO(int status) {
		super();
		this.status = status;
	}

	@Override
	public String toString() {
		return "UpdateStatusDTO [status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpdateStatusDTO other = (UpdateStatusDTO) obj;
		return status == other.status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}


