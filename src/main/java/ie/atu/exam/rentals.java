package ie.atu.exam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Rentals")
public class rentals {
    List<RentalBooking> rentalBookingList = new ArrayList<>();
    @GetMapping("/getRentals")
            public List<RentalBooking> getRentalBooking()
    {
        return rentalBookingList;
    }
    @PostMapping("/postRentals")
            public List<RentalBooking> addRentalBooking (@Valid @RequestBody RentalBooking rentalBooking)
    {
        rentalBookingList.add(rentalBooking);
        return rentalBookingList;
    }
}
