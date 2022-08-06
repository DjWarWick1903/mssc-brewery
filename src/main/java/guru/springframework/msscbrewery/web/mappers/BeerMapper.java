package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.v1.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);

}
