package sometask;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static sometask.Airport.Hamburg;
import static sometask.Airport.Moscow;
import static sometask.Airport.New_York;

public class FlightTask {

    static List<Flight> flights = new ArrayList<>();
    // Prepare data
    static {
        flights.add(new Flight("153SC", LocalDateTime.of(2021, 10, 15, 9, 20), LocalDateTime.of(2021, 10, 15, 14, 15), Hamburg, "Boeing 735", 1100));
        flights.add(new Flight("SE3443", LocalDateTime.of(2021, 10, 13, 6, 15), LocalDateTime.of(2021, 10, 14, 2, 10), New_York, "Boeing 345", 5500));
        flights.add(new Flight("XP843", LocalDateTime.of(2021, 10, 17, 18, 10), LocalDateTime.of(2021, 10, 17, 22, 50), Moscow, "Boeing 655", 1800));
    }

    static Flight getLongestFlight(List<Flight> flights) {
        return flights.stream().max((a, b) -> {
            return (Duration.between(b.arrivalTime, b.departureTime)).compareTo(Duration.between(a.arrivalTime, a.departureTime));
        }).get();
    }

    public static void main(String[] args) {
        System.out.printf("The longest flight is: %s", getLongestFlight(flights));
    }
}
