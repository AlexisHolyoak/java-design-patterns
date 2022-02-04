package state.two;

import java.lang.reflect.Field;

public abstract class ValueObject {
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        return isEqual(other);
    }

    public boolean isEqual(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Field[] fields = getFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object valueThis = null;
            Object valueOther = null;
            try {
                valueThis = field.get(this);
                valueOther = field.get(other);
            } catch (Exception ex) {
            }
            if (valueOther == null) {
                if (valueThis != null) {
                    return false;
                }
            } else if (!valueOther.equals(valueThis)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        Field[] fields = getFields();
        int startValue = 17;
        int multiplier = 59;
        int hashCodeValue = startValue;
        for (Field field : fields) {
            Object value = null;
            try {
                value = field.get(this);
            } catch (Exception ex) {
            }
            if (value != null) {
                hashCodeValue = hashCodeValue * multiplier + value.hashCode();
            }
        }
        return hashCodeValue;
    }

    private Field[] getFields() {
        return this.getClass().getDeclaredFields();
    }
}
