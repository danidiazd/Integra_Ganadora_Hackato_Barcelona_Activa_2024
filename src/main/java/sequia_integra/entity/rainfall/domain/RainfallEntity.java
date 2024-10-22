package sequia_integra.entity.rainfall.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "rainfall")
public class RainfallEntity {
    @Id
    private String id;
    @Field
    private int Any;
    @Field
    private int Mes;
    @Field
    private double Precipitacions;

}
