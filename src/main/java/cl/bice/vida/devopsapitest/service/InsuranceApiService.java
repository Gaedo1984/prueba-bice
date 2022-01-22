package cl.bice.vida.devopsapitest.service;

import cl.bice.vida.devopsapitest.dto.InsuranceDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class InsuranceApiService {
    @Autowired
    private RestTemplate restTemplate;

    public Optional<InsuranceDto> getInsurance() {
        try {
            InsuranceDto insuranceDto =  restTemplate.getForObject("https://dn8mlk7hdujby.cloudfront.net/interview/insurance/58",
                    InsuranceDto.class);

            return Optional.of(insuranceDto);

        } catch (HttpClientErrorException e) {
            log.error("[getInsurance] Insurance not found ", e);
            return Optional.empty();
        }catch (RestClientException e) {
            log.error("[getInsurance] ConnectException",e);
            throw e;
        } catch (Exception e){
            log.error("[getInsurance] Exception:",e);
            throw e;
        }
    }
}
