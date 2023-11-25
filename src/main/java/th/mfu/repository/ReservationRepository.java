package th.mfu.repository;

import org.springframework.data.repository.CrudRepository;

import th.mfu.model.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    
}
