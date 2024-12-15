package pe.edu.i202217363.ef_veliz_daniel.response;

import pe.edu.i202217363.ef_veliz_daniel.dto.CarDetailDto;
import pe.edu.i202217363.ef_veliz_daniel.dto.CarDto;

import java.util.List;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
