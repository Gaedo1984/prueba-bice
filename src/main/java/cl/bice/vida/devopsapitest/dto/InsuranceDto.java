package cl.bice.vida.devopsapitest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceDto {
    private InsuranceDto.InsuranceData insurance;
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InsuranceData{
        private String name;
        private String description;
        private Integer price;
        private String image;
    }

}
