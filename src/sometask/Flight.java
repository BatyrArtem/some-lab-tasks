package sometask;

import java.time.LocalDateTime;

public class Flight {

    String flightNum;
    LocalDateTime departureTime;
    LocalDateTime arrivalTime;
    Airport destination;
    String planeModel;
    int distance;

    public Flight(String flightNum, LocalDateTime departureTime, LocalDateTime arrivalTime, Airport destination, String planeModel, int distance) {
        this.flightNum = flightNum;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.planeModel = planeModel;
        this.distance = distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flight{");
        sb.append("flightNum='").append(flightNum).append('\'');
        sb.append(", departureTime=").append(departureTime);
        sb.append(", arrivalTime=").append(arrivalTime);
        sb.append(", destination=").append(destination);
        sb.append(", planeModel='").append(planeModel).append('\'');
        sb.append(", distance=").append(distance);
        sb.append('}');
        return sb.toString();
    }
}
