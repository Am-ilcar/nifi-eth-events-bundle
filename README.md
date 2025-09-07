# NiFi Ethereum Events Bundle

[![Maven Central](https://img.shields.io/maven-central/v/io.github.am-ilcar/nifi-eth-events-bundle)](https://central.sonatype.com/artifact/io.github.am-ilcar/nifi-eth-events-bundle)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-21+-blue.svg)](https://openjdk.java.net/)
[![Apache NiFi](https://img.shields.io/badge/Apache%20NiFi-2.5.0-orange.svg)](https://nifi.apache.org/)

A production-ready Apache NiFi extension bundle for real-time Ethereum Beacon Chain event processing via Server-Sent Events (SSE).

## 🚀 Features

- **Real-time Event Streaming**: Listen to Ethereum Beacon Chain events in real-time
- **Configurable Event Filtering**: Subscribe to specific event types (head, block, attestation, etc.)
- **Production Ready**: Comprehensive error handling and logging
- **High Performance**: Optimized for high-throughput event processing
- **Easy Integration**: Simple configuration and deployment

## 📦 Components

### Controller Service: `StandardBeaconEventsService`

Provides connectivity to Ethereum Beacon Chain event streams.

**Configuration:**
- **Base URL**: Ethereum beacon chain API endpoint


### Processor: `BeaconEventsProcessor`

- **Topics**: Event types to subscribe to
Processes incoming events and creates FlowFiles for downstream processing.

**Relationships:**
- `success`: Successfully processed events
- `failure`: Failed event processing

## 🛠️ Installation

### Maven Central

Add to your Maven project:

```xml
<dependency>
    <groupId>io.github.am-ilcar</groupId>
    <artifactId>nifi-eth-events-bundle</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Manual Installation

1. Download the NAR files from [releases](https://github.com/Am-ilcar/nifi-eth-events-bundle/releases)
2. Copy to your NiFi `lib` directory:
   - `nifi-eth-events-services-api-nar-1.0.0.nar`
   - `nifi-eth-events-services-nar-1.0.0.nar`
   - `nifi-eth-events-processors-nar-1.0.0.nar`
3. Restart NiFi

### Build from Source

```bash
git clone https://github.com/Am-ilcar/nifi-eth-events-bundle.git
cd nifi-eth-events-bundle
mvn clean package
```

## 🔧 Configuration

### 1. Create Controller Service
1. Add a `StandardBeaconEventsService` controller service
2. Configure the Beacon Chain API endpoint
3. Select event types to monitor

### 2. Add Processor
1. Add `BeaconEventsProcessor` to your flow
2. Reference the controller service
3. Configure event filtering

### Example Configuration

```yaml
Controller Service:
  Base URL: "https://your-beacon-node.example.com"

Processor:
  Event Types: "head,block,attestation"
```

## 📊 Supported Event Types

| Event Type | Description |
|------------|-------------|
| `head` | New head of the beacon chain |
| `block` | New beacon block |
| `attestation` | Validator attestations |
| `voluntary_exit` | Voluntary validator exits |
| `proposer_slashing` | Proposer slashing events |
| `attester_slashing` | Attester slashing events |
| `blob_sidecar` | Blob sidecar data |
| `finalized_checkpoint` | Finalized checkpoints |
| `chain_reorg` | Chain reorganization events |

## 🎯 Use Cases

- **Blockchain Monitoring**: Real-time monitoring of Ethereum Beacon Chain
- **DeFi Applications**: Event-driven DeFi protocol integration
- **Analytics Pipelines**: Stream events to analytics platforms
- **Alerting Systems**: Create alerts based on specific blockchain events
- **Data Archiving**: Archive blockchain events for compliance

## 🔧 Requirements

- **Java**: 21 or higher
- **Apache NiFi**: 2.3.0 or higher (optimized for 2.5.0)
- **Network**: Access to Ethereum Beacon Chain RPC endpoint

## 🤝 Contributing

We welcome contributions! Please see our [contributing guidelines](CONTRIBUTING.md).

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/amazing-feature`
3. Commit changes: `git commit -m 'Add amazing feature'`
4. Push to branch: `git push origin feature/amazing-feature`
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🐛 Issues & Support

- **Bug Reports**: [GitHub Issues](https://github.com/Am-ilcar/nifi-eth-events-bundle/issues)
- **Feature Requests**: [GitHub Issues](https://github.com/Am-ilcar/nifi-eth-events-bundle/issues)
- **Discussions**: [GitHub Discussions](https://github.com/Am-ilcar/nifi-eth-events-bundle/discussions)

## 🔗 Related Projects

- [eth-events-listener](https://github.com/Am-ilcar/eth-events-listener) - Core event listening library
- [Apache NiFi](https://nifi.apache.org/) - Data integration platform

## 🏆 Acknowledgments

- Apache NiFi community for the excellent data integration platform
- Ethereum Foundation for the Beacon Chain specifications
- Contributors and maintainers

---

**Made with ❤️ for the Ethereum and Apache NiFi communities**
