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
@Document(collection = "stores")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodStore {

    @ApiModelProperty(name = "id",value = "id",dataType = "UUID",example = "9df4a996-8a7a-4309-bbbd-b6cfc16b4dfd")
    @Id
    private UUID id;

    @ApiModelProperty(name = "stationId",value = "stationId",dataType = "String",example = "shanghai")
    @NotNull
    private String stationId;

    @ApiModelProperty(name = "storeName",value = "storeName",dataType = "String",example = "KFC")
    private String storeName;

    @ApiModelProperty(name = "telephone",value = "telephone",dataType = "String",example = "01-234567")
    private String telephone;

    @ApiModelProperty(name = "businessTime",value = "businessTime",dataType = "String",example = "10:00-20:00")
    private String businessTime;

    @ApiModelProperty(name = "deliveryFee",value = "deliveryFee",dataType = "double",example = "20.0")
    private double deliveryFee;

    @ApiModelProperty(name = "foodList",value = "foodList",dataType = "List<Food>",example = "[\n" +
            "    {\n" +
            "        \"foodName\": \"Hamburger\",\n" +
            "        \"price\": 5.0\n" +
            "    },\n" +
            "    {\n" +
            "        \"foodName\": \"Cola\",\n" +
            "        \"price\": 2.0\n" +
            "    },\n" +
            "    {\n" +
            "        \"foodName\": \"Chicken\",\n" +
            "        \"price\": 10.5\n" +
            "    }\n" +
            "]")
    private List<Food> foodList;

    public FoodStore(){
        //Default Constructor
        this.stationId = "";
    }

}
