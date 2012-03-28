package eu.scapeproject.model;

import java.util.UUID;

public class UUIDIdentifier implements Identifier {
    private final UUID uuid;

    public UUIDIdentifier() {
        this.uuid = UUID.randomUUID();
    }

    public UUIDIdentifier(UUID uuid) {
        super();
        this.uuid = uuid;
    }
    
    public UUIDIdentifier(String uuid) {
        super();
        this.uuid = UUID.fromString(uuid);
    }
    
    public String getType() {
        return "UUID";
    }

    public String getValue() {
        return uuid.toString();
    }
}
