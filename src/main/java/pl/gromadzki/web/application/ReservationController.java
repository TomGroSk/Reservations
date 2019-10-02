package pl.gromadzki.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.gromadzki.business.domain.RoomReservation;
import pl.gromadzki.business.service.ReservationService;

import java.util.List;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method= RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model){
        List<RoomReservation> roomReservation = this.reservationService.getRoomReservationsForDate(dateString);
        model.addAttribute("roomReservations", roomReservation);
        return "reservations";
    }
}
