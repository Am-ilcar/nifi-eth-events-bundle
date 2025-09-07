# Contributing to NiFi Ethereum Events Bundle

Thank you for your interest in contributing to the NiFi Ethereum Events Bundle! We welcome contributions from the community.

## 🤝 How to Contribute

### Reporting Issues

- Use the [GitHub Issues](https://github.com/Am-ilcar/nifi-eth-events-bundle/issues) page
- Search existing issues before creating a new one
- Provide detailed information including:
  - NiFi version
  - Java version
  - Steps to reproduce
  - Expected vs actual behavior
  - Log files if applicable

### Feature Requests

- Open an issue with the `enhancement` label
- Describe the use case and benefits
- Provide implementation suggestions if you have any

### Code Contributions

1. **Fork** the repository
2. **Create** a feature branch: `git checkout -b feature/my-feature`
3. **Make** your changes
4. **Test** thoroughly
5. **Commit** with descriptive messages
6. **Push** to your fork
7. **Submit** a Pull Request

## 🔧 Development Setup

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- Apache NiFi 2.3.0+ (for testing)

### Building

```bash
git clone https://github.com/Am-ilcar/nifi-eth-events-bundle.git
cd nifi-eth-events-bundle
mvn clean install
```

### Testing

```bash
# Run all tests
mvn test

# Run specific test
mvn test -Dtest=BeaconEventsProcessorTest
```

## 📋 Coding Standards

### Java Code Style

- Follow standard Java conventions
- Use meaningful variable and method names
- Add Javadoc for public methods
- Maximum line length: 120 characters

### Commit Messages

- Use clear, descriptive commit messages
- Start with a verb in present tense
- Reference issue numbers when applicable

Example:
```
Add support for blob_sidecar events

- Implement blob_sidecar event processing
- Add unit tests for new functionality
- Update documentation

Fixes #123
```

### Pull Request Guidelines

- Keep PRs focused on a single feature/fix
- Include tests for new functionality
- Update documentation as needed
- Ensure all tests pass
- Request review from maintainers

## 🧪 Testing Guidelines

### Unit Tests

- Write tests for all new functionality
- Maintain high test coverage
- Use descriptive test method names
- Mock external dependencies

### Integration Tests

- Test with real NiFi instances when possible
- Verify NAR packaging works correctly
- Test with different NiFi versions

## 📚 Documentation

### Code Documentation

- Add Javadoc for all public APIs
- Include parameter descriptions
- Document return values and exceptions

### User Documentation

- Update README.md for new features
- Add configuration examples
- Include troubleshooting guides

## 🚀 Release Process

1. Update version numbers
2. Update CHANGELOG.md
3. Create release branch
4. Test thoroughly
5. Merge to main
6. Tag release
7. Deploy to Maven Central

## 📞 Getting Help

- Check existing documentation
- Search GitHub Issues
- Open a discussion for questions
- Contact maintainers if needed

## 📄 License

By contributing, you agree that your contributions will be licensed under the MIT License.

Thank you for contributing! 🎉
