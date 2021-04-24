package chess.model;

import java.util.Arrays;
import java.util.List;

public class Move {

    CellIndex start;
    CellIndex end;

    public Move(String input) {
        String[] splitInput = input.split("-");
        start = parseCellIndex(splitInput[0]);
        end = parseCellIndex(splitInput[1]);
    }

    private CellIndex parseCellIndex(String startString1) {
        String startString = startString1;
        String startColumn =  startString.substring(0, 1);
        String startRowString = startString.substring(1, 2);
        return new CellIndex(Integer.parseInt(startRowString) - 1, columns.indexOf(startColumn));
    }

    static List<String> columns = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");

    @Override
    public String toString() {
        return "Move{" +
                "start=" + columns.get(start.column) + "" + start.row +
                ", end=" + columns.get(end.column) + "" + end.row +
                '}';
    }
}
