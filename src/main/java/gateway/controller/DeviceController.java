package gateway.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestParam;

	import gateway.model.Device;

	import gateway.service.Deviceservice;


	@RestController
	public class DeviceController {
		@Autowired
		private Deviceservice deviceService;
		

		@RequestMapping("/devices")
		public List<Device> getallDevice()  {
			return deviceService.getalldevices();

		}/*
		@RequestMapping("/devicesfromcv")
		public List<DeviceCV> getallDevicefromCV() throws GatewayServicesException {
			return deviceCVService.getalldevicesfromCV();

		}*/
	/*	@RequestMapping("/getdevicebyid")
		public List<Device> getDeviceById(@RequestParam("Id") String Id)  {
			return deviceService.getdevicebyId(Id);

		}
	
		
		
		@RequestMapping(method = RequestMethod.POST, value = "/adddevices")
		public String addDevice(@RequestBody Device device)
				{		
			String resp = deviceService.addDevice(device);
			return resp;

		}*/


	}

