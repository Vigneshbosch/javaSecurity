package gateway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQuery;


@Entity
@Table(name="\"Device\"")

public class Device {

	@Id
	@Column(name="\"deviceGuid\"")
	private String deviceGuid;	
	@Column(name="\"deviceName\"")
	private String deviceName;

	public Device() {
	}
	

	public Device(String deviceGuid, String deviceName) {
		super();
		this.deviceGuid = deviceGuid;
		this.deviceName = deviceName;
	}


	public String getDeviceGuid() {
		return deviceGuid;
	}



	public void setDeviceGuid(String deviceGuid) {
		this.deviceGuid = deviceGuid;
	}



	public String getDeviceName() {
		return deviceName;
	}



	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	}
