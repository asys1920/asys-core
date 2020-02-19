package com.asys1920.mapper;

import com.asys1920.dto.CarDTO;
import com.asys1920.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car carDTOToCar(CarDTO carDTO);

    CarDTO carToCarDTO(Car car);

    List<Car> listCarDTOsToCars(List<CarDTO> carDTOList);

    List<CarDTO> listCarToCarDTOs(List<Car> carList);


}
