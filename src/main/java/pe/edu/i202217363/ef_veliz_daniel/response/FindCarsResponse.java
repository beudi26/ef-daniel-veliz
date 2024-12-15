package pe.edu.i202217363.ef_veliz_daniel.response;

import pe.edu.i202217363.ef_veliz_daniel.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
