package startech.calendar.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPersistence extends JpaRepository<Event, Long> {
}
