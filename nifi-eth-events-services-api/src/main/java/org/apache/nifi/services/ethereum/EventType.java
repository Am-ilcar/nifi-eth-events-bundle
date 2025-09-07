package org.apache.nifi.services.ethereum;

/**
 * Beacon chain event types supported by the Controller Service API.
 * This enum intentionally mirrors the external listener library values
 * without introducing a direct dependency in the API module.
 */
public enum EventType {
    HEAD,
    BLOCK,
    BLOCK_GOSSIP,
    ATTESTATION,
    SINGLE_ATTESTATION,
    VOLUNTARY_EXIT,
    BLS_TO_EXECUTION_CHANGE,
    PROPOSER_SLASHING,
    ATTESTER_SLASHING,
    FINALIZED_CHECKPOINT,
    CHAIN_REORG,
    CONTRIBUTION_AND_PROOF,
    LIGHT_CLIENT_FINALITY_UPDATE,
    LIGHT_CLIENT_OPTIMISTIC_UPDATE,
    PAYLOAD_ATTRIBUTES,
    BLOB_SIDECAR
}
