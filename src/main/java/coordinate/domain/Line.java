package coordinate.domain;


import java.util.Objects;

public class Line implements Comparable<Line>{
    private Double length;

    public Line(Double length) {
        this.length = length;
    }

    public double findSquareArea(Line length) {
        return this.length * length.length;
    }

    @Override
    public int compareTo(Line o) {
        return Double.compare(o.length,length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return length.equals(line.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
