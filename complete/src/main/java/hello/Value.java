package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;

        Value value = (Value) o;

        if (id != null ? !id.equals(value.id) : value.id != null) return false;
        return !(quote != null ? !quote.equals(value.quote) : value.quote != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (quote != null ? quote.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "hello.Value(id=" + this.id + ", quote=" + this.quote + ")";
    }
}
