package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerId\":\"d6df1c3f-6d8e-4a9d-84e4-2c17e9b3459e\",\"beerName\":\"Beer Name\",\"beerStyle\":\"Ale\",\"upc\":123123123,\"price\":12.99,\"createdDate\":\"2021-07-29T20:43:46.685066+02:00\",\"lastUpdatedDate\":\"2021-07-29T20:43:46.686437+02:00\"}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}