package se.lexicon.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    private Booking testObject;

    @BeforeEach
    public void init(){
        testObject = new Booking(
                LocalDateTime.parse("2021-05-14T09:00"),
                0,
                "Stickan",
                "Pfizer BioNTech Covid-19 Vaccine",
                new Premises());
    }

     @Test
     @DisplayName("Setting the dataTime correctly")
    public void setDateTime_successfully(){
         //Arrange
         LocalDateTime timestamp = LocalDateTime.now();

         // Act
         testObject.setDateTime(timestamp);
         //Assert

         assertEquals(timestamp,testObject.getDateTime());
    }

    @Test
    public void setDateTime_should_throw_IllegalArgumentException_then_null(){
        assertThrows(
                IllegalArgumentException.class,
                () -> testObject.setDateTime(null)
        );
    }

    @Test
    public void setPremises_should_throwIllegalArgumentException_then_null(){
        assertThrows(
                IllegalArgumentException.class,
                () -> testObject.setPremises(null)
        );
    }


}