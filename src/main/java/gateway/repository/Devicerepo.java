package gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import gateway.model.Device;
import java.util.List;


public interface Devicerepo extends JpaRepository<Device, String> {
/*
 * @Query(value="SELECT d.\"deviceGuid\",d.\"deviceName\" from \"Device\" d where d.\"deviceGuid\" =?1 ",nativeQuery=true)
 */
//public List<Device> findByDeviceGuid(String Id);

}