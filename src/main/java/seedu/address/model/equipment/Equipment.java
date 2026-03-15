package seedu.address.model.equipment;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.model.room.Status;

public class Equipment {
    private final EquipmentName name;
    private final String category;
    private final EquipmentStatus status;

    /**
     * Every field must be present and not null.
     */
    public Equipment(EquipmentName name, String category, EquipmentStatus status) {
        requireAllNonNull(name, category, status);
        this.name = name;
        this.category = category;
        this.status = status;
    }

    public boolean isSameEquipment(Equipment otherEquipment) {
        if (otherEquipment == this) {
            return true;
        }

        return otherEquipment != null
                && otherEquipment.getName().equals(getName()) // EquipmentName.equals handles case
                && otherEquipment.getCategory().equalsIgnoreCase(getCategory());
    }

    public EquipmentName getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public EquipmentStatus getStatus() {
        return status;
    }
}