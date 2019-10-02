package pl.gromadzki.web.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.gromadzki.business.domain.RoomReservation;
import pl.gromadzki.business.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {

    private final ReservationService reservationService;

    public ReservationServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method= RequestMethod.GET, value="/{date}")
    public List<RoomReservation> getAllReservationsForDate(@PathVariable(value="date")String dateString){
        return this.reservationService.getRoomReservationsForDate(dateString);
    }
}
