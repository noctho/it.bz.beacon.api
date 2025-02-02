package it.bz.beacon.api.model;

import javax.validation.constraints.NotNull;

public class IssueStatusChange {

    @NotNull
    private boolean resolved;

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
