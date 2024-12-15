package pe.edu.i202217363.ef_veliz_daniel.service;

import pe.edu.i202217363.ef_veliz_daniel.dto.CarDetailDto;
import pe.edu.i202217363.ef_veliz_daniel.dto.CarDto;
import pe.edu.i202217363.ef_veliz_daniel.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;

}
