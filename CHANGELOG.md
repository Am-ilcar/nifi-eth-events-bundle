# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] - 2025-09-07

### Added
- Initial release of NiFi Ethereum Events Bundle
- `StandardBeaconEventsService` controller service for Ethereum Beacon Chain connectivity
- `BeaconEventsProcessor` for processing blockchain events
- Support for all major Ethereum Beacon Chain event types:
  - head, block, attestation
  - voluntary_exit, proposer_slashing, attester_slashing
  - blob_sidecar, finalized_checkpoint, chain_reorg
- Real-time event streaming via Server-Sent Events (SSE)
- Comprehensive unit test coverage
- Production-ready error handling and logging
- MIT License
- Maven Central publication support

### Technical Details
- Java 21+ compatibility
- Apache NiFi 2.5.0 compatibility (hybrid versioning strategy)
- NAR plugin 2.1.0
- Integration with eth-events-listener 1.0.2

### Documentation
- Complete README with installation and usage instructions
- Contributing guidelines
