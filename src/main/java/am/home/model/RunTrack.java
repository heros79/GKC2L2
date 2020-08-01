package am.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RunTrack {
    private int length;

    public RunTrack(int length) {
        this.length = length;
    }
}