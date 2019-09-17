package pl.gromadzki.data.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gromadzki.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
