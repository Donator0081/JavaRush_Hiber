package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Rating {
    G("G"), PG("PG"), PG13("PG-13"), R("R"), NC17("NC-17");

    private String rating;
}
