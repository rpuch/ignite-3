package org.apache.ignite.internal.components;

/**
 * Simple container for node properties.
 */
public class PropertiesContainer implements NodeProperties {
    /** Delegate with actual node properties. */
    private final NodeProperties nodeProperties;

    /**
     * Creates a new container.
     *
     * @param nodeProperties Node properties implementation.
     */
    public PropertiesContainer(NodeProperties nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    /** Returns the underlying node properties. */
    public NodeProperties nodeProperties() {
        return nodeProperties;
    }

    @Override
    public boolean colocationEnabled() {
        return nodeProperties.colocationEnabled();
    }
}
