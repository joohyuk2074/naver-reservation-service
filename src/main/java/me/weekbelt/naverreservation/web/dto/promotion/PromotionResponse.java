package me.weekbelt.naverreservation.web.dto.promotion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.weekbelt.naverreservation.web.dto.promotion.PromotionDto;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
public class PromotionResponse {

    List<PromotionDto> items;

    public PromotionResponse(List<PromotionDto> items) {
        this.items = items;
    }
}
