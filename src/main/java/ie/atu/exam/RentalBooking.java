package ie.atu.exam;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import jdk.jfr.Timestamp;
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

    @Timestamp private String StartDate;
    @Timestamp private String EndDate;

    @PositiveOrZero (message = "Please enter an dailyRate") private int dailyRate;

    @NotBlank (message = "Rental Created Successfully") private String message;

    @Timestamp private String timeStamp;

    @NotBlank (message = "End date must be after start date") private String error2;
    @NotBlank (message = "InvalidRentalDataException") private String error;

}
