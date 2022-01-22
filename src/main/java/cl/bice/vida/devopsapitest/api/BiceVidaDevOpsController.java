package cl.bice.vida.devopsapitest.api;

import cl.bice.vida.devopsapitest.dto.InsuranceDto;
import cl.bice.vida.devopsapitest.service.InsuranceApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bice_vida")
@Slf4j
public class BiceVidaDevOpsController {
    @Autowired
    private InsuranceApiService service;

    @GetMapping(path = "/insurances", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InsuranceDto> getInsurance() throws Exception {
        InsuranceDto dto = service.getInsurance().orElseThrow(Exception::new);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
