package vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Classifier {

    private List<String> phoneTypes;
    private List<String> customerTypes;
}
