package com.inventory.stock.service.dto;


import com.inventory.stock.service.enums.Unit;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntryRequest {
    @NotNull
    private BigDecimal price;
    @NotNull
    private Integer quantity;
    @NotNull
    private Unit unit;
    private String expireDate;
    @NotNull
    @NotBlank
    private String lotNumber;
    @NotNull
    @NotBlank
    private String file;
    @NotNull
    @NotBlank
    private String numGoodCommand;
    @NotNull
    @NotBlank
    private String product;
    @NotNull
    @NotBlank
    private String supplier;

    private Integer qteConsumed;

    private String raison;
}
