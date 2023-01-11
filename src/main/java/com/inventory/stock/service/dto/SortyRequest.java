package com.inventory.stock.service.dto;

import com.inventory.stock.service.enums.Unit;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SortyRequest {

    @NotNull
    @NotBlank
    private String productId;
    @NotNull
    @NotBlank
    private String customerId;
    @NotNull
    private Unit unit;
    @NotNull
    private Integer qte;
    @NotNull
    @NotBlank
    private String entryId;

}
