package gateway.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gateway.model.Device;
import gateway.repository.Devicerepo;
	
@Service
public class Deviceservice {

@Autowired
private Devicerepo devicerepo;

	public List<Device> getalldevices()  {

			List<Device> devices = new ArrayList<>();
			try {
				devicerepo.findAll().forEach(devices::add);
			} catch (Exception e) {
				e.getMessage();
			}

			return devices;

		}
		
/*	public List<Device> getdevicebyId(String Id)  {

			List<Device> device = new ArrayList<>();
			try {
				devicerepo.findByDeviceGuid(Id).forEach(device::add);
			} catch (Exception e) {
				e.getMessage();
			}

			return device;

		}


	public String addDevice(Device device)  {
			try {
				devicerepo.save(device);

			} catch (Exception e) {

				e.getMessage();
			}
				return "Success";

			}
*/
		}
