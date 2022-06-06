package food.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@ApiModel
@Data
@Document(collection = "trainfoods")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainFood {

    @ApiModelProperty(name = "id",value = "id",dataType = "UUID",example = "cf422093-fdbe-424b-b500-94b6d3f3ac81")
    @Id
    private UUID id;

    @ApiModelProperty(name = "tripId",value = "tripId",dataType = "String",example = "G1234")
    @NotNull
    private String tripId;

    @ApiModelProperty(name = "foodList",value = "foodList",dataType = "List<Food>",example = "[\n" +
            "    {\n" +
            "        \"foodName\": \"Pork Chop with rice\",\n" +
            "        \"price\": 9.5\n" +
            "    },\n" +
            "    {\n" +
            "        \"foodName\": \"Egg Soup\",\n" +
            "        \"price\": 3.2\n" +
            "    }\n" +
            "]")
    private List<Food> foodList;

    public TrainFood(){
        //Default Constructor
        this.tripId = "";
    }

}
