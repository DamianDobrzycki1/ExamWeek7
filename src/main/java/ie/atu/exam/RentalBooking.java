package ie.atu.exam;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RentalBooking {

    @NotBlank (message = "Please enter an rentalCode") private String rentalCode;
    @NotBlank (message = "Please enter an carModel") private String carModel;
    @NotBlank (message = "Please enter an name") private String name;
    @Email (message = "Please enter an Email") private String email;
    @PositiveOrZero (message = "Please enter an StartDate") private int StartDate;
    @PositiveOrZero (message = "Please enter an EndDate") private int EndDate;
    @PositiveOrZero (message = "Please enter an dailyRate") private int dailyRate;
}
