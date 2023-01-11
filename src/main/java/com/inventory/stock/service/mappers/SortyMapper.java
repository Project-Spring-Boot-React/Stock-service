package com.inventory.stock.service.mappers;

import com.inventory.stock.service.dto.EntryRequest;
import com.inventory.stock.service.dto.EntryResponse;
import com.inventory.stock.service.dto.SortyRequest;
import com.inventory.stock.service.models.Entry;
import com.inventory.stock.service.models.Sorty;

//@Mapper // mapstruct
public interface SortyMapper {
    Sorty dtoToModel (SortyRequest requestDTO);
}
